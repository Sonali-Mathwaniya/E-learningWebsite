package com.elearn.service;
 
import com.elearn.auth.AuthGroup;
import com.elearn.auth.AuthGroupRepository;
import com.elearn.model.User;
import com.elearn.repository.UserRepository;
import com.ezlearning.platform.dto.UserDto;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AuthGroupRepository authGroupRepository;

       
    
    
    public UserService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
		super();
		this.userRepository = userRepository;
		this.authGroupRepository = authGroupRepository;
	}

	public void createUser(UserDto userDto) throws IllegalStateException {

        if (null != userRepository.findByUsername(userDto.getUsername())) {
            throw new IllegalStateException("this user name does not exit" + userDto.getUsername());
        } else if (null != userRepository.findByEmail(userDto.getEmail())) {
            throw new IllegalStateException("this user email does not exist " + userDto.getEmail());
        }
        String username = userDto.getUsername();
        String password = new BCryptPasswordEncoder(11).encode(userDto.getPassword());
        String phoneNumber = userDto.getPhoneNumber();
        String email = userDto.getEmail();
       // log.info("Getting image");
        //log.info("about to upload");
         
        LocalDate fecha = LocalDate.now();
        User user = new User(username, password, phoneNumber,  email, fecha);
        AuthGroup group = new AuthGroup();

        group.setUsername(userDto.getUsername());
        group.setAuthgroup("USER");

        userRepository.save(user);
        authGroupRepository.save(group);
    }

    public void update(User user) {
        User current = userRepository.findByUsername(user.getUsername());

        current.setPhoneNumber(user.getPhoneNumber());
        
        
        
           userRepository.save(current);
    }

    
}

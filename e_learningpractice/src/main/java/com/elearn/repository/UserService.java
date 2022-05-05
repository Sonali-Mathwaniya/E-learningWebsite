package com.elearn.repository;
  
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.elearn.auth.AuthGroup;
import com.elearn.auth.AuthGroupRepository;
import com.elearn.model.User;
import com.elearn.repository.UserRepository;

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

	public void createUser(User user) throws IllegalStateException {

        if (null != userRepository.findByUserName(user.getUserName())) {
            throw new IllegalStateException("exit user name = " + user.getUserName());
        } else if (null != userRepository.findByUserEmail(user.getUserEmail())) {
            throw new IllegalStateException("exit user email =  " + user.getUserEmail());
        }
        String username = user.getUserName();
        String password = new BCryptPasswordEncoder(11).encode(user.getUserPassword());
        String number = user.getUserPhone();
        String  designation= user.getDesignation();
        String email = user.getUserEmail();
       // log.info("Getting image");
        //log.info("about to upload");
        
        LocalDate fecha = LocalDate.now();
        User userSet = new User(username, password, number, designation, email, fecha);
        AuthGroup group = new AuthGroup();

        group.setUsername(user.getUserName());
        group.setAuthgroup("USER");

        userRepository.save(userSet);
        authGroupRepository.save(group);
    }

    public void update(User user) {
        User current = userRepository.findByUserName(user.getUserName());

        current.setUserPhone(user.getUserPhone());
      
        userRepository.save(current);
    }

    
}

package com.elearn.service;
 
 
import com.elearn.model.User;
import com.elearn.repository.UserRepository;
 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepository userRepository;
   // private final AuthGroupRepository authGroupRepository;

       
    
    
    public UserService(UserRepository userRepository ) {
		super();
		this.userRepository = userRepository;
	//	this.authGroupRepository = authGroupRepository;
	}

	public void createUser(User userDto) throws IllegalStateException {

        if (null != userRepository.findByUserName(userDto.getUserName())) {
            throw new IllegalStateException("this user name alredy exit" + userDto.getUserName());
        } else if (null != userRepository.findByUserEmail(userDto.getUserEmail())) {
            throw new IllegalStateException("this user email alredy exist " + userDto.getUserEmail());
        }
      
        String username = userDto.getUserName();
     //   String password = new BCryptPasswordEncoder(11).encode(userDto.getPassword());
       String password = userDto.getUserPassword();
        String userphone = userDto.getUserPhone();
       
        String email = userDto.getUserEmail();
      String designation=userDto.getDesignation();
     
      
        // log.info("Getting image");
        //log.info("about to upload");
         
        LocalDate fecha = LocalDate.now();
        User user = new User(username,email,designation ,password,userphone,fecha);
       // AuthGroup group = new AuthGroup();

      //  group.setUsername(userDto.getUsername());
       // group.setAuthgroup("USER");

        userRepository.save(user);
        //authGroupRepository.save(group);
    }

    public void update(User user) {
        User current = userRepository.findByUserName(user.getUserName());

        current.setUserPhone(user.getUserPhone());
        
        
        
           userRepository.save(current);
    }

    
}

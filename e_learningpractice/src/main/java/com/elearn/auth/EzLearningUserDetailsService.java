package com.elearn.auth;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.elearn.model.User;
import com.elearn.repository.UserRepository;

import java.util.List;

@Service
public class EzLearningUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AuthGroupRepository authGroupRepository;

    public EzLearningUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
        super();
        this.userRepository = userRepository;
        this.authGroupRepository = authGroupRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("No se encuentra usuario:" + username);
        }
        List<AuthGroup> authGroups = this.authGroupRepository.findByUsername(username);
        return new UserPrincipal(user, authGroups);
    }
}

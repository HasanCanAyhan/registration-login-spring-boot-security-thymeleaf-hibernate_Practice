package com.cydeo.service.impl;

import com.cydeo.entity.Role;
import com.cydeo.entity.User;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.UserService;
import com.cydeo.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository; // @Autowired

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {

        User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),
                registrationDto.getEmail(),
                registrationDto.getPassword(),//it should be encoded
                Arrays.asList(new Role("ROLE_USER")) );

        return userRepository.save(user);
    }


}

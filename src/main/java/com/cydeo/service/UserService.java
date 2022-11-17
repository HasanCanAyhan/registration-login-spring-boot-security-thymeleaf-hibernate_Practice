package com.cydeo.service;

import com.cydeo.entity.User;
import com.cydeo.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);


}

package com.cydeo.service;

import com.cydeo.entity.User;
import com.cydeo.web.dto.UserRegistrationDto;

public interface UserService {

    User save(UserRegistrationDto registrationDto);


}

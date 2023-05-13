package com.onlinelearning.authuser.services.impl;

import com.onlinelearning.authuser.repositories.UserRepository;
import com.onlinelearning.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
}

package org.example.controllers;

import org.example.domain.UserCommand;
import org.example.entities.User;
import org.example.mappers.UserMapper;

public class UserController {

    User saveUser(UserCommand userCommand) {
        // fake implementation
        return  UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}

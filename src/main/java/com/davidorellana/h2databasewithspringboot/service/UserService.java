package com.davidorellana.h2databasewithspringboot.service;

import com.davidorellana.h2databasewithspringboot.model.data.User;
import com.davidorellana.h2databasewithspringboot.model.dto.UserDto;

import java.util.HashMap;

public interface UserService {

    HashMap<Long, User> getAllUsers();
    User findUserById(Long idUser);
    User createUser(UserDto userDto);
    User updateUserById(Long idUser, UserDto userDto);
    Boolean deleteUserById(Long idUser);
}

package com.crud.spring.services;

import com.crud.spring.persistence.entities.UserEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    public UserEntity createUser(UserEntity user);
    public List<UserEntity> getAllUsers();
    public Optional<UserEntity> getUserById(Long userId);
    public UserEntity updateUser(Long userId, UserEntity newUser);
    public HashMap<String, String> deleteUser(Long userId);
}

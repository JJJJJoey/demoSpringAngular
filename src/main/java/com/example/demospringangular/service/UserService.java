package com.example.demospringangular.service;

import com.example.demospringangular.domain.User;

import java.util.Optional;

public interface UserService extends BaseService<User>{
    User findByEmail(String email);

    User findByFirstName(String name);
}

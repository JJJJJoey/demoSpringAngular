package com.example.demospringangular.service;

import com.example.demospringangular.domain.User;

public interface UserService extends BaseService<User>{
    User findByEmail(String email);
}

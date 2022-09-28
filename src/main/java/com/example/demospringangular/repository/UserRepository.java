package com.example.demospringangular.repository;

import com.example.demospringangular.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    User findByFirstname(String name);

}

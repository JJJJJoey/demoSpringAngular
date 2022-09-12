package com.example.demospringangular.bootstrap;

import com.example.demospringangular.base.BaseComponent;
import com.example.demospringangular.domain.User;
import com.example.demospringangular.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BasicSampleUserGenerator extends BaseComponent implements CommandLineRunner {
    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = List.of(
                User.builder().email("lalala@lalal.com").build(),
                User.builder().email("dsdsdasd@lalal.com").build(),
                User.builder().email("d3dwde@lalal.com").build(),
                User.builder().email("dwedwedsds@lalal.com").build(),
                User.builder().email("d3d3@lalal.com").build(),
                User.builder().email("l3dd3ala@lalal.com").build()
        );

        List<User> persistedUsers = userService.createAll(users);

    }
}

package kofin.shop.api.cloud.user.controller;

import kofin.shop.api.cloud.user.domain.User;
import kofin.shop.api.cloud.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public Optional<User> findById(@PathVariable long id){
        return userService.findByID(id);
    }
}

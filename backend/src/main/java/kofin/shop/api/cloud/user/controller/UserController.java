package kofin.shop.api.cloud.user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kofin.shop.api.cloud.user.domain.User;
import kofin.shop.api.cloud.user.domain.UserSerializer;
import kofin.shop.api.cloud.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users/{id}")
    public ResponseEntity<UserSerializer> getById(@PathVariable long id) throws JsonProcessingException{
        User user = userService.findByID(id).get();
        UserSerializer userSerializer = UserSerializer.builder()
                .userId(user.getUserId())
                .username(user.getUserName())
                .password(user.getPassword())
                .name(user.getName())
                .email(user.getEmail())
                .regDate(user.getRegDate())
                .build();
        return new ResponseEntity<>(userSerializer, HttpStatus.OK);
    }
}

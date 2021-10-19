package kofin.shop.api.cloud.user.controller;

import kofin.shop.api.cloud.user.domain.User;
import kofin.shop.api.cloud.user.domain.UserDto;
import kofin.shop.api.cloud.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto user){
        String returnUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println("리액트에서 넘어온 정보: "+user.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable long id){
        System.out.println("----------------");
        User user = userService.findByID(id).get();
        UserDto userSerializer = UserDto.builder()
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

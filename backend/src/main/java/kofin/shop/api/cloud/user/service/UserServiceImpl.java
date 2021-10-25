package kofin.shop.api.cloud.user.service;

import kofin.shop.api.cloud.user.domain.User;
import kofin.shop.api.cloud.user.domain.UserDto;
import kofin.shop.api.cloud.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public Optional<User> findByID(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Optional<User> login(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public void join(User user) {
        userRepository.save(user);
    }
}

package kofin.shop.api.cloud.user.service;

import kofin.shop.api.cloud.user.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByID(long userId);
}

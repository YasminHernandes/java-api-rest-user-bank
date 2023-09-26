package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    Iterable<User> findAll();
    User findById(Long id);
    User create(User userToCreate);
    void update(Long id, User user);
    void delete(Long id);
}

package com.grin.service;

import com.grin.models.User;

import java.util.List;

public interface UserService {
    String create(User user);

    User update(User user);

    List<User> findAll();

    User findById(String id);

    void deleteById(String id);

    boolean exists(User user);
}

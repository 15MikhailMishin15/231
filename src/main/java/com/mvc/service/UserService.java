package com.mvc.service;

import com.mvc.model.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void deleteById(Long id);
    void update(User user);
}

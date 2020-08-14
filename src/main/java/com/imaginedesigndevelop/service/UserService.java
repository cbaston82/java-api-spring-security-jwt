package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    User findByStripeCustomerId(String stripeCustomerId);

    Optional<User> findByResetToken(String resetToken);

    Optional<User> findById(Integer id);

    List<User> findAll();

    Optional<User> getOne(Integer id);

    void delete(Integer id);
}

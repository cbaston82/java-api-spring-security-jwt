package com.imaginedesigndevelop.repository;

import com.imaginedesigndevelop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);

    User findByEmail(String email);

    User findByStripeCustomerId(String stripeCustomerId);

    Optional<User> findByResetToken(String resetToken);
}

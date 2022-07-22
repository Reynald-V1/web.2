package com.example.gqstests2.repository;

import com.example.gqstests2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(Long Id);
}
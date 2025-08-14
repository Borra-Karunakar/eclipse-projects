package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

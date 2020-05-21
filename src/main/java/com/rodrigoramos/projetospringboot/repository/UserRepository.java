package com.rodrigoramos.projetospringboot.repository;

import com.rodrigoramos.projetospringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

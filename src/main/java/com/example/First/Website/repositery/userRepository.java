package com.example.First.Website.repositery;

import com.example.First.Website.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Long> {
}

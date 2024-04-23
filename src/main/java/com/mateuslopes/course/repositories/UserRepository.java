package com.mateuslopes.course.repositories;

import com.mateuslopes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

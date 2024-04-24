package com.mateuslopes.course.repositories;

import com.mateuslopes.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package com.mateuslopes.course.resources;

import com.mateuslopes.course.entities.Order;
import com.mateuslopes.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    OrderRepository service;

    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable long id) {
        Optional<Order> obj = service.findById(id);
        return ResponseEntity.ok().body(obj.get());
    }
}

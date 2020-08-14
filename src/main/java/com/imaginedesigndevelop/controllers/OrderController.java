package com.imaginedesigndevelop.controllers;


import io.swagger.annotations.ApiOperation;
import com.imaginedesigndevelop.model.Order;
import com.imaginedesigndevelop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @ApiOperation(value = "Create an order")
    @PostMapping(value = "/orders")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> addOrder(@RequestBody Order order,
                                         UriComponentsBuilder builder) {
        orderService.save(order);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/orders/{id}").buildAndExpand(order.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Gets all orders")
    @GetMapping(value = "/orders")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<List> getAllOrders(UriComponentsBuilder builder) {
        List orders = orderService.findAll();
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(orders, headers, HttpStatus.OK);
    }

    @ApiOperation(value = "Get an order by id")
    @GetMapping(value = "/orders/{id}")
    @PreAuthorize("hasAuthority('admin:read')")
    public ResponseEntity<Optional<Order>> findOrderById(
        @PathVariable("id") Integer id) {
        Optional<Order> order = orderService.findById(id);
        return new ResponseEntity<Optional<Order>>(order, HttpStatus.OK);
    }

    @ApiOperation(value = "Update an order")
    @PutMapping(value = "/orders")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Order> updateUser(@RequestBody Order order) {
        orderService.save(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @ApiOperation(value = "Delete an order by id")
    @DeleteMapping(value = "/orders/{id}")
    @PreAuthorize("hasAuthority('admin:write')")
    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Integer id) {
        orderService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void save(Order order);

    Optional<Order> findById(Integer id);

    List<Order> findAll();

    void delete(Integer id);

    List getBusinessSatisfactionCounts(Integer id);

    List getBusinessCultureCounts(Integer id);

    List getBusinessGenderCounts(Integer id);

    List getUsersDob(Integer id);

    List getBusinessBusyness(Integer id);
}

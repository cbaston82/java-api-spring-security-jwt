package com.imaginedesigndevelop.service;

import com.imaginedesigndevelop.repository.OrderRepository;
import com.imaginedesigndevelop.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List getBusinessSatisfactionCounts(Integer id) {
        return orderRepository.getBusinessSatisfactionCounts(id);
    }

    @Override
    public List getBusinessCultureCounts(Integer id) {
        return orderRepository.getBusinessCultureCounts(id);
    }

    @Override
    public List getBusinessGenderCounts(Integer id) {
        return orderRepository.getBusinessGenderCounts(id);
    }

    @Override
    public List getUsersDob(Integer id) {
        return orderRepository.getUsersDob(id);
    }

    @Override
    public List getBusinessBusyness(Integer id) {
        return orderRepository.getBusinessBusyness(id);
    }
}

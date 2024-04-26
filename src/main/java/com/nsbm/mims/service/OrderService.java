package com.nsbm.mims.service;

import com.nsbm.mims.model.Order;

import java.util.List;

//order services
public interface OrderService {
    Order createOrder(Order order);

    Order getOrder(Long orderId);

    Order updateOrder(Long orderId, Order orderDetails);

    void deleteOrder(Long orderId);

    List<Order> getAllOrders();
}
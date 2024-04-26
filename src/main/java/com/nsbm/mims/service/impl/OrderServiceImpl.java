package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Order;
import com.nsbm.mims.repository.OrderRepository;
import com.nsbm.mims.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    //create order
    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    //get selected order details
    @Override
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    //update order
    @Override
    public Order updateOrder(Long orderId, Order orderDetails) {
        Order order = getOrder(orderId);
        if (order == null)
            return null;

        // Update order details
        order.setItemId(orderDetails.getItemId());
        order.setQuantity(orderDetails.getQuantity());
        // Update other fields as needed

        return orderRepository.save(order);
    }

    //delete order
    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    //get all the details of orders
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll(); // Assuming findAll() fetches all orders from the repository
    }
}
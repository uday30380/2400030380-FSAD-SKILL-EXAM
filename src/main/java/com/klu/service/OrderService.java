package com.klu.service;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.klu.model.*;
	import com.klu.repository.*;

	@Service
	public class OrderService 
	{
	    @Autowired
	    OrderRepository orderRepository;

	    public Order addOrder(Order order)
	    {
	        return orderRepository.save(order);
	    }

	    public List<Order> getAllOrders()
	    {
	        return orderRepository.findAll();
	    }
	}

package com.klu.controller;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.klu.model.*;
	import com.klu.service.*;

	@RestController
	@RequestMapping("/orders")
	public class OrderController 
	{

	    @Autowired
	    OrderService orderService;

	    // POST - Add Order
	    @PostMapping("/add")
	    public Order addOrder(@RequestBody Order order)
	    {
	        return orderService.addOrder(order);
	    }

	    // GET - Fetch Orders
	    @GetMapping("/all")
	    public List<Order> getOrders()
	    {
	        return orderService.getAllOrders();
	    }
}

//package com.FoodOrdering.FoodOrdering.controller;
//
//import com.FoodOrdering.FoodOrdering.model.Order;
//import com.FoodOrdering.FoodOrdering.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/order")
//public class OrderController {
//    @Autowired
//    private OrderService orderService;
//    @PostMapping("/cust")
//    public List<Order> orders(@RequestBody List<Order> ord){
//        return orderService.orders(ord);
//    }
//
//}

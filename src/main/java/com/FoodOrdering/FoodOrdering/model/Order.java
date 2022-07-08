//package com.FoodOrdering.FoodOrdering.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.Date;
//
//@Entity
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String f_name;
//    private String l_name;
//    private String email;
//    private Date orderdate;
//
//    public Order() {
//    }
//
//    public Order(String f_name, String l_name, String email, Date orderdate) {
//        this.f_name = f_name;
//        this.l_name = l_name;
//        this.email = email;
//        this.orderdate = orderdate;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getF_name() {
//        return f_name;
//    }
//
//    public void setF_name(String f_name) {
//        this.f_name = f_name;
//    }
//
//    public String getL_name() {
//        return l_name;
//    }
//
//    public void setL_name(String l_name) {
//        this.l_name = l_name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getOrderdate() {
//        return orderdate;
//    }
//
//    public void setOrderdate(Date orderdate) {
//        this.orderdate = orderdate;
//    }
//}

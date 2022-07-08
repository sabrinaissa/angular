package com.FoodOrdering.FoodOrdering.controller;

import com.FoodOrdering.FoodOrdering.model.Admin;
import com.FoodOrdering.FoodOrdering.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService service;
    @PostMapping("/user")
    public void adduser(@RequestBody Admin admin){
        String username = admin.getUsername();
        if(username =! null){
            admin username = AdminService.fetAdminByusername(username);
            if(username=null){
                throw new Exception("username elready exist");
            }
        }
        admin newadmin = null;
        service.adduser(admin);
        return newadmin;

    }
    @PostMapping("/postlist")
    public List<Admin> addusers(@RequestBody List <Admin> add){
        return service.addusers(add);
    }
    @PutMapping("admin/{id}")
    public void updateadmin(@PathVariable Integer id, @RequestBody Admin update){
        service.updateadmin(update);
    }
    @GetMapping("/getadmin")
    public List<Admin> getadmin(){
        return service.getadmin();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteadmin(@PathVariable Integer id){
        service.deleteadmin(id);
    }

}

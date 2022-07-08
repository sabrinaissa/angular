package com.FoodOrdering.FoodOrdering.service;

import com.FoodOrdering.FoodOrdering.model.Admin;
import com.FoodOrdering.FoodOrdering.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo repo;
    public void adduser(Admin admin) {
        repo.save(admin);
    }

    public List<Admin> addusers(List<Admin> add) {
        return repo.saveAll(add);
    }

    public void updateadmin(Admin update) {
        repo.save(update);
    }

    public List<Admin> getadmin() {
        return repo.findAll();
    }

    public void deleteadmin(Integer id){
        repo.deleteById(id);
    }
}

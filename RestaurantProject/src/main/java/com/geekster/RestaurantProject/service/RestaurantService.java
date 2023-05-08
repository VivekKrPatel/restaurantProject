package com.geekster.RestaurantProject.service;

import com.geekster.RestaurantProject.model.Restaurant;
import com.geekster.RestaurantProject.repositories.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public String insertRestro(List<Restaurant> restaurants) {
        boolean isInserted = restaurantRepo.addRestro(restaurants);
        if(isInserted){
            return "added successfully...";
        }
        return "failed to add...";
    }

    public List<Restaurant> getAllRestro() {
        return restaurantRepo.find();
    }
}

package com.geekster.RestaurantProject.controller;

import com.geekster.RestaurantProject.model.Restaurant;
import com.geekster.RestaurantProject.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value = "/restro/all")
    public String addRestro(@RequestBody List<Restaurant> restaurants) {
        return restaurantService.insertRestro(restaurants);
    }

    @GetMapping(value = "/restro/all")
    public List<Restaurant> getAllRestro() {
        return restaurantService.getAllRestro();
    }
}

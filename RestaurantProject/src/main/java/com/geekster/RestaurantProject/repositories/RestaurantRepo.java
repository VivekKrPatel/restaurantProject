package com.geekster.RestaurantProject.repositories;

import com.geekster.RestaurantProject.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {

    private List<Restaurant> restaurantList;

    public RestaurantRepo() {
        restaurantList = new ArrayList<>();
    }

    public boolean addRestro(List<Restaurant> restaurants) {
        restaurantList.addAll(restaurants);
        return true;
    }

    public List<Restaurant> find() {
        return restaurantList;
    }
}

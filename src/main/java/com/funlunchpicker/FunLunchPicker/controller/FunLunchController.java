package com.funlunchpicker.FunLunchPicker.controller;

import com.funlunchpicker.FunLunchPicker.dto.Restaurants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FunLunchController {

    @RequestMapping(value = "/api/restaurants", method = RequestMethod.GET)
    public ResponseEntity<Object> getRestaurants() {

        List<Restaurants> restaurantsList = new ArrayList<>();

        return null;
    }
}

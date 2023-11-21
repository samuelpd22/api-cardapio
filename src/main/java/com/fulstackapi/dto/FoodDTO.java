package com.fulstackapi.dto;

import com.fulstackapi.domain.Food;

public record FoodDTO(Long id, String title , String image , Integer price) {

    public FoodDTO(Food food){
    this(food.getId(),food.getTitle(), food.getImage(), food.getPrice());
    }
}

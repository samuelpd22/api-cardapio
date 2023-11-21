package com.fulstackapi.controller;

import com.fulstackapi.domain.Food;
import com.fulstackapi.dto.FoodDTO;
import com.fulstackapi.dto.FoodRequestDTO;
import com.fulstackapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    FoodRepository foodRepository;

    @CrossOrigin(origins = "=", allowedHeaders = "=")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO food){
        Food foodDate = new Food(food);
        foodRepository.save(foodDate);
    }
    @CrossOrigin(origins = "=", allowedHeaders = "=")
    @GetMapping
    public List<FoodDTO> getAll(){
        List<FoodDTO> foodList = foodRepository.findAll().stream().map(FoodDTO::new)
                .toList();
        return foodList;
    }
}

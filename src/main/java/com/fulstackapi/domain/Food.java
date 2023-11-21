package com.fulstackapi.domain;

import com.fulstackapi.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity (name = "foods")
@Table (name = "foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    private String image;

    private Integer price;

    public Food(FoodRequestDTO food){
        this.image = food.image();
        this.price = food.price();
        this.title = food.title();
    }
}

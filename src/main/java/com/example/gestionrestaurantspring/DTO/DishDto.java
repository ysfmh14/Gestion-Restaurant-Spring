package com.example.gestionrestaurantspring.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DishDto {
    private Long id;
    private String dishCode;
    private String name;
    private String description;
    private double price;
}

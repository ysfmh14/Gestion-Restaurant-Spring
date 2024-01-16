package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.DishDto;

import java.util.List;

public interface DishService {
    List<DishDto> getAllDishs();

    DishDto addDish(DishDto dishDto);
    DishDto UpdateDish(DishDto dishDto);
    void  deleteDish(long dishId);
}

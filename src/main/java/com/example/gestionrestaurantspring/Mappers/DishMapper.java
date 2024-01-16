package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.DTO.DishDto;
import com.example.gestionrestaurantspring.Entities.Commande;
import com.example.gestionrestaurantspring.Entities.Dish;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface DishMapper {
    Dish dtoToModel(DishDto dishDto);

    DishDto modelToDto(Dish dish);

    List<DishDto> modelToDtos(List<Dish> dishList);
}

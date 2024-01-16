package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.DishDto;
import com.example.gestionrestaurantspring.DTO.FactureDto;
import com.example.gestionrestaurantspring.Entities.Dish;
import com.example.gestionrestaurantspring.Entities.Facture;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface FactureMapper {
    Facture dtoToModel(FactureDto factureDto);

    FactureDto modelToDto(Facture facture);

    List<FactureDto> modelToDtos(List<Facture> factureList);
}

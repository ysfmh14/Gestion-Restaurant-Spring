package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.FactureDto;
import com.example.gestionrestaurantspring.DTO.MenuDto;
import com.example.gestionrestaurantspring.Entities.Facture;
import com.example.gestionrestaurantspring.Entities.Menu;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface MenuMapper {
    Menu dtoToModel(MenuDto menuDto);

    MenuDto modelToDto(Menu menu);

    List<MenuDto> modelToDtos(List<Menu> menuList);
}

package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.FactureDto;
import com.example.gestionrestaurantspring.DTO.MenuDto;

import java.util.List;

public interface MenuService {
    List<MenuDto> getAllMenus();

    MenuDto addMenu(MenuDto menuDto);
    MenuDto UpdateMenu(MenuDto menuDto);
    void  deleteMenu(long menuId);
}

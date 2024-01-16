package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.MenuDto;
import com.example.gestionrestaurantspring.Entities.Menu;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-16T17:10:14+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class MenuMapperImpl implements MenuMapper {

    @Override
    public Menu dtoToModel(MenuDto menuDto) {
        if ( menuDto == null ) {
            return null;
        }

        Menu menu = new Menu();

        menu.setId( menuDto.getId() );

        return menu;
    }

    @Override
    public MenuDto modelToDto(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuDto menuDto = new MenuDto();

        menuDto.setId( menu.getId() );

        return menuDto;
    }

    @Override
    public List<MenuDto> modelToDtos(List<Menu> menuList) {
        if ( menuList == null ) {
            return null;
        }

        List<MenuDto> list = new ArrayList<MenuDto>( menuList.size() );
        for ( Menu menu : menuList ) {
            list.add( modelToDto( menu ) );
        }

        return list;
    }
}

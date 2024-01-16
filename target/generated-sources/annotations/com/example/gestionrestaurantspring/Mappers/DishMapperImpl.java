package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.DishDto;
import com.example.gestionrestaurantspring.Entities.Dish;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-16T17:10:13+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class DishMapperImpl implements DishMapper {

    @Override
    public Dish dtoToModel(DishDto dishDto) {
        if ( dishDto == null ) {
            return null;
        }

        Dish dish = new Dish();

        dish.setId( dishDto.getId() );
        dish.setDishCode( dishDto.getDishCode() );
        dish.setName( dishDto.getName() );
        dish.setDescription( dishDto.getDescription() );
        dish.setPrice( dishDto.getPrice() );

        return dish;
    }

    @Override
    public DishDto modelToDto(Dish dish) {
        if ( dish == null ) {
            return null;
        }

        DishDto dishDto = new DishDto();

        dishDto.setId( dish.getId() );
        dishDto.setDishCode( dish.getDishCode() );
        dishDto.setName( dish.getName() );
        dishDto.setDescription( dish.getDescription() );
        dishDto.setPrice( dish.getPrice() );

        return dishDto;
    }

    @Override
    public List<DishDto> modelToDtos(List<Dish> dishList) {
        if ( dishList == null ) {
            return null;
        }

        List<DishDto> list = new ArrayList<DishDto>( dishList.size() );
        for ( Dish dish : dishList ) {
            list.add( modelToDto( dish ) );
        }

        return list;
    }
}

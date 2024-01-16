package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.ReservationDto;
import com.example.gestionrestaurantspring.DTO.TableDto;
import com.example.gestionrestaurantspring.Entities.Reservation;
import com.example.gestionrestaurantspring.Entities.Table;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface TableMapper {
    Table dtoToModel(TableDto tableDto);

   TableDto modelToDto(Table table);

    List<TableDto> modelToDtos(List<Table> tableList);
}

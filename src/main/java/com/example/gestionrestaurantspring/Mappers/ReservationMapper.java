package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.MenuDto;
import com.example.gestionrestaurantspring.DTO.ReservationDto;
import com.example.gestionrestaurantspring.Entities.Menu;
import com.example.gestionrestaurantspring.Entities.Reservation;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface ReservationMapper {
    Reservation dtoToModel(ReservationDto reservationDto);

    ReservationDto modelToDto(Reservation reservation);

    List<ReservationDto> modelToDtos(List<Reservation> reservationList);
}

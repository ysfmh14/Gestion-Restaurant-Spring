package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.MenuDto;
import com.example.gestionrestaurantspring.DTO.ReservationDto;

import java.util.List;

public interface ReservationService {
    List<ReservationDto> getAllReservations();

    ReservationDto addReservation(ReservationDto reservationDto);
    ReservationDto UpdateReservation(ReservationDto reservationDto);
    void  deleteReservation(long reservationId);
}

package com.example.gestionrestaurantspring.Services.Impl;

import com.example.gestionrestaurantspring.DTO.ReservationDto;
import com.example.gestionrestaurantspring.Services.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public List<ReservationDto> getAllReservations() {
        return null;
    }

    @Override
    public ReservationDto addReservation(ReservationDto reservationDto) {
        return null;
    }

    @Override
    public ReservationDto UpdateReservation(ReservationDto reservationDto) {
        return null;
    }

    @Override
    public void deleteReservation(long reservationId) {

    }
}

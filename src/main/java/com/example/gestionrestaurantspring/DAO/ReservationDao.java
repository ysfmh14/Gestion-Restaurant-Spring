package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation,Long> {
}

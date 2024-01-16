package com.example.gestionrestaurantspring.DTO;

import com.example.gestionrestaurantspring.Entities.Client;
import com.example.gestionrestaurantspring.Entities.Table;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {
    private Long id;
    private Date reservationDate;
    private int nbrOfPerson;
    private Client client;
    private Table table;
}

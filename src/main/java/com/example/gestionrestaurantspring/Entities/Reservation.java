package com.example.gestionrestaurantspring.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reservationDate")
    @Temporal(TemporalType.DATE)
    private Date reservationDate;
    @Column(name = "nbrOfPerson")
    private int nbrOfPerson;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Table table;
}

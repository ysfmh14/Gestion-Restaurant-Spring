package com.example.gestionrestaurantspring.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "table_restau")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tableCode",unique = true)
    private String tableCode;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "libre")
    private boolean libre;

    @OneToMany(mappedBy = "table")
    private List<Reservation> reservationList ;


}

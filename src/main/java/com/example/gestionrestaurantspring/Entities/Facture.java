package com.example.gestionrestaurantspring.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "total")
    private double total;
    @Column(name = "tip")
    private double tip;
    @OneToOne
    private Commande commande;


}

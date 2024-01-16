package com.example.gestionrestaurantspring.DTO;

import com.example.gestionrestaurantspring.Entities.Commande;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FactureDto {
    private Long id;
    private double total;
    private double tip;
    private Commande commande;
}

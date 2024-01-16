package com.example.gestionrestaurantspring.DTO;

import com.example.gestionrestaurantspring.Entities.Client;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommandeDto {
    private Long id;
    private String commandeCode;
    private Date commandeDate;
    private Client client;
}

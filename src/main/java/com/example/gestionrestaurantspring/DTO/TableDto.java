package com.example.gestionrestaurantspring.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TableDto {
    private Long id;
    private String tableCode;
    private int capacity;
    private boolean libre;
}

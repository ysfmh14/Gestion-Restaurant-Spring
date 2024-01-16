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
public class ClientDto {

    private Long id;
    private String clientCode;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}

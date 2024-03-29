package com.example.gestionrestaurantspring.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "clientCode",unique = true)
    private String clientCode;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phone",length = 10)
    private String phone;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandeList;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservationList ;

}

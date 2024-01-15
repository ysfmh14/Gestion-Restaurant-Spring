package com.example.gestionrestaurantspring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dishCode",unique = true)
    private String dishCode;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name="price")
    private double price;
    @ManyToMany(mappedBy = "dishList")
    private List<Commande> commandeList;

}

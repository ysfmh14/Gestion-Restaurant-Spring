package com.example.gestionrestaurantspring.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id
    private Long id;
    @Column(name = "commandeCode", unique = true)
    private String commandeCode;
    @Column(name = "dateCommande")
    @Temporal(TemporalType.DATE)
    private Date commandeDate;
    @ManyToOne
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "commande_dish",
            joinColumns = @JoinColumn(name = "dish_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "commande_id",
                    referencedColumnName = "id"))
    private List<Dish> dishList;
}

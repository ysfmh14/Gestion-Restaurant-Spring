package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande,Long> {
}

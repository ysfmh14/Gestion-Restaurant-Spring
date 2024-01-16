package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureDao extends JpaRepository<Facture,Long> {
}

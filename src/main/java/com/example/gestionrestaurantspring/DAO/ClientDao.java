package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Long> {
}

package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<Menu,Long> {
}

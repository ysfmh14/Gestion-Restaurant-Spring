package com.example.gestionrestaurantspring.DAO;

import com.example.gestionrestaurantspring.Entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishDao extends JpaRepository<Dish,Long> {
}

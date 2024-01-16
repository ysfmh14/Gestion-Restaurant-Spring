package com.example.gestionrestaurantspring.DAO;


import com.example.gestionrestaurantspring.Entities.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableDao extends JpaRepository<Table,Long> {
}

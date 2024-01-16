package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.TableDto;

import java.util.List;

public interface TableService {
    List<TableDto> getAllTables();

    TableDto addTable(TableDto tableDto);
    TableDto UpdateTable(TableDto ableDto);
    void  deleteTable(long tableId);
}

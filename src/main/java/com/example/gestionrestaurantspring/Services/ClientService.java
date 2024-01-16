package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.CommandeDto;

import java.util.List;

public interface ClientService {
    List<ClientDto> getAllClients();

    ClientDto addClient(ClientDto clientDto);
    ClientDto UpdateClient(ClientDto clientDto);
    void  deleteClient(long clientId);
}

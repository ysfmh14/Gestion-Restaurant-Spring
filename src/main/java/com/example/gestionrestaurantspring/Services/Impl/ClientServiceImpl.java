package com.example.gestionrestaurantspring.Services.Impl;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.Services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public List<ClientDto> getAllClients() {
        return null;
    }

    @Override
    public ClientDto addClient(CommandeDto commandeDto) {
        return null;
    }

    @Override
    public ClientDto UpdateClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(long clientId) {

    }
}

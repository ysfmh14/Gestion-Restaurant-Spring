package com.example.gestionrestaurantspring.Services.Impl;

import com.example.gestionrestaurantspring.DAO.ClientDao;
import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.Entities.Client;
import com.example.gestionrestaurantspring.Exceptions.EntityAlreadyExisteException;
import com.example.gestionrestaurantspring.Exceptions.EntityNotFoundException;
import com.example.gestionrestaurantspring.Mappers.ClientMapper;
import com.example.gestionrestaurantspring.Services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private ClientDao clientDao;
    private ClientMapper clientMapper;
    @Override
    public List<ClientDto> getAllClients() {
        List<Client> clientList = clientDao.findAll();
        if (clientList.isEmpty()){
            throw new EntityNotFoundException("Clients Not Found");
        }
        return clientMapper.modelToDtos(clientList);
    }

    @Override
    public ClientDto addClient(ClientDto clientDto) {
        Optional<Client> c = Optional.of(clientDao.getById(clientDto.getId()));
        if (c.isPresent()) {
            throw new EntityAlreadyExisteException("Client Already Exist");
        }
        Client client = clientMapper.dtoToModel(clientDto);
        Client savedClient= clientDao.save(client);
        return clientMapper.modelToDto(savedClient);


    }

    @Override
    public ClientDto UpdateClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(long clientId) {
       Optional<Client> client = clientDao.findById(clientId);
       if (!client.isPresent()){
           throw new EntityNotFoundException("Client Not Found ID :  "+clientId);
       }
       clientDao.deleteById(clientId);
    }
}

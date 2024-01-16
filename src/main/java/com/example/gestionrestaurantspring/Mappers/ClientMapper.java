package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.Entities.Client;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface ClientMapper {
    Client dtoToModel(ClientDto clientDto);

    ClientDto modelToDto(Client client);

    List<ClientDto> modelToDtos(List<Client> clientList);
}

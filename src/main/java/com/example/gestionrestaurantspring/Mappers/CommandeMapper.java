package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.Entities.Client;
import com.example.gestionrestaurantspring.Entities.Commande;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
@Service
public interface CommandeMapper {
    Commande dtoToModel(CommandeDto commandeDto);

    CommandeDto modelToDto(Commande commande);

    List<CommandeDto> modelToDtos(List<Commande> commandeList);
}

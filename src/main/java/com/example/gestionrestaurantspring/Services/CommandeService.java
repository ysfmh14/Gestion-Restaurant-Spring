package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.CommandeDto;

import java.util.List;

public interface CommandeService {
    List<CommandeDto> getAllCommandes();

    CommandeDto addCommande(CommandeDto commandeDto);
    CommandeDto UpdateCommande(CommandeDto commandeDto);
    void  deleteCommande(long commandeId);
}

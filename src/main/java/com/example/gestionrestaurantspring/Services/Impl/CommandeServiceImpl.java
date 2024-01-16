package com.example.gestionrestaurantspring.Services.Impl;

import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.Services.CommandeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
    @Override
    public List<CommandeDto> getAllCommandes() {
        return null;
    }

    @Override
    public CommandeDto addCommande(CommandeDto commandeDto) {
        return null;
    }

    @Override
    public CommandeDto UpdateCommande(CommandeDto commandeDto) {
        return null;
    }

    @Override
    public void deleteCommande(long commandeId) {

    }
}

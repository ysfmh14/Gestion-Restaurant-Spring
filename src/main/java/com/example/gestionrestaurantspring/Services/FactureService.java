package com.example.gestionrestaurantspring.Services;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.DTO.FactureDto;

import java.util.List;

public interface FactureService {
    List<FactureDto> getAllFactures();

    FactureDto addFacture(FactureDto factureDto);
    FactureDto UpdateFacture(FactureDto factureDto);
    void  deleteFacture(long factureId);
}

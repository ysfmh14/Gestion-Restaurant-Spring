package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.FactureDto;
import com.example.gestionrestaurantspring.Entities.Facture;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-16T17:10:13+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class FactureMapperImpl implements FactureMapper {

    @Override
    public Facture dtoToModel(FactureDto factureDto) {
        if ( factureDto == null ) {
            return null;
        }

        Facture facture = new Facture();

        facture.setId( factureDto.getId() );
        facture.setTotal( factureDto.getTotal() );
        facture.setTip( factureDto.getTip() );
        facture.setCommande( factureDto.getCommande() );

        return facture;
    }

    @Override
    public FactureDto modelToDto(Facture facture) {
        if ( facture == null ) {
            return null;
        }

        FactureDto factureDto = new FactureDto();

        factureDto.setId( facture.getId() );
        factureDto.setTotal( facture.getTotal() );
        factureDto.setTip( facture.getTip() );
        factureDto.setCommande( facture.getCommande() );

        return factureDto;
    }

    @Override
    public List<FactureDto> modelToDtos(List<Facture> factureList) {
        if ( factureList == null ) {
            return null;
        }

        List<FactureDto> list = new ArrayList<FactureDto>( factureList.size() );
        for ( Facture facture : factureList ) {
            list.add( modelToDto( facture ) );
        }

        return list;
    }
}

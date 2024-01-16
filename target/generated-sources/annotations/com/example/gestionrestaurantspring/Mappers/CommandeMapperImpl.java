package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.CommandeDto;
import com.example.gestionrestaurantspring.Entities.Commande;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-16T17:10:14+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class CommandeMapperImpl implements CommandeMapper {

    @Override
    public Commande dtoToModel(CommandeDto commandeDto) {
        if ( commandeDto == null ) {
            return null;
        }

        Commande commande = new Commande();

        commande.setId( commandeDto.getId() );
        commande.setCommandeCode( commandeDto.getCommandeCode() );
        commande.setCommandeDate( commandeDto.getCommandeDate() );
        commande.setClient( commandeDto.getClient() );

        return commande;
    }

    @Override
    public CommandeDto modelToDto(Commande commande) {
        if ( commande == null ) {
            return null;
        }

        CommandeDto commandeDto = new CommandeDto();

        commandeDto.setId( commande.getId() );
        commandeDto.setCommandeCode( commande.getCommandeCode() );
        commandeDto.setCommandeDate( commande.getCommandeDate() );
        commandeDto.setClient( commande.getClient() );

        return commandeDto;
    }

    @Override
    public List<CommandeDto> modelToDtos(List<Commande> commandeList) {
        if ( commandeList == null ) {
            return null;
        }

        List<CommandeDto> list = new ArrayList<CommandeDto>( commandeList.size() );
        for ( Commande commande : commandeList ) {
            list.add( modelToDto( commande ) );
        }

        return list;
    }
}

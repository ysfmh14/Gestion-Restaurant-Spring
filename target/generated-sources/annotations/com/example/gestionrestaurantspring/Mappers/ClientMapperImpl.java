package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.ClientDto;
import com.example.gestionrestaurantspring.Entities.Client;
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
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client dtoToModel(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.getId() );
        client.setClientCode( clientDto.getClientCode() );
        client.setFirstName( clientDto.getFirstName() );
        client.setLastName( clientDto.getLastName() );
        client.setPhone( clientDto.getPhone() );
        client.setEmail( clientDto.getEmail() );

        return client;
    }

    @Override
    public ClientDto modelToDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto clientDto = new ClientDto();

        clientDto.setId( client.getId() );
        clientDto.setClientCode( client.getClientCode() );
        clientDto.setFirstName( client.getFirstName() );
        clientDto.setLastName( client.getLastName() );
        clientDto.setPhone( client.getPhone() );
        clientDto.setEmail( client.getEmail() );

        return clientDto;
    }

    @Override
    public List<ClientDto> modelToDtos(List<Client> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( clientList.size() );
        for ( Client client : clientList ) {
            list.add( modelToDto( client ) );
        }

        return list;
    }
}

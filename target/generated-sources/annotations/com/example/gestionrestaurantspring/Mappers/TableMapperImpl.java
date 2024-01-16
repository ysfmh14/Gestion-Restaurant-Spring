package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.TableDto;
import com.example.gestionrestaurantspring.Entities.Table;
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
public class TableMapperImpl implements TableMapper {

    @Override
    public Table dtoToModel(TableDto tableDto) {
        if ( tableDto == null ) {
            return null;
        }

        Table table = new Table();

        table.setId( tableDto.getId() );
        table.setTableCode( tableDto.getTableCode() );
        table.setCapacity( tableDto.getCapacity() );
        table.setLibre( tableDto.isLibre() );

        return table;
    }

    @Override
    public TableDto modelToDto(Table table) {
        if ( table == null ) {
            return null;
        }

        TableDto tableDto = new TableDto();

        tableDto.setId( table.getId() );
        tableDto.setTableCode( table.getTableCode() );
        tableDto.setCapacity( table.getCapacity() );
        tableDto.setLibre( table.isLibre() );

        return tableDto;
    }

    @Override
    public List<TableDto> modelToDtos(List<Table> tableList) {
        if ( tableList == null ) {
            return null;
        }

        List<TableDto> list = new ArrayList<TableDto>( tableList.size() );
        for ( Table table : tableList ) {
            list.add( modelToDto( table ) );
        }

        return list;
    }
}

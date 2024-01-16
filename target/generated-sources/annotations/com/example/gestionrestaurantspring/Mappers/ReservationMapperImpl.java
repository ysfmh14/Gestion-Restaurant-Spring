package com.example.gestionrestaurantspring.Mappers;

import com.example.gestionrestaurantspring.DTO.ReservationDto;
import com.example.gestionrestaurantspring.Entities.Reservation;
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
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public Reservation dtoToModel(ReservationDto reservationDto) {
        if ( reservationDto == null ) {
            return null;
        }

        Reservation reservation = new Reservation();

        reservation.setId( reservationDto.getId() );
        reservation.setReservationDate( reservationDto.getReservationDate() );
        reservation.setNbrOfPerson( reservationDto.getNbrOfPerson() );
        reservation.setClient( reservationDto.getClient() );
        reservation.setTable( reservationDto.getTable() );

        return reservation;
    }

    @Override
    public ReservationDto modelToDto(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDto reservationDto = new ReservationDto();

        reservationDto.setId( reservation.getId() );
        reservationDto.setReservationDate( reservation.getReservationDate() );
        reservationDto.setNbrOfPerson( reservation.getNbrOfPerson() );
        reservationDto.setClient( reservation.getClient() );
        reservationDto.setTable( reservation.getTable() );

        return reservationDto;
    }

    @Override
    public List<ReservationDto> modelToDtos(List<Reservation> reservationList) {
        if ( reservationList == null ) {
            return null;
        }

        List<ReservationDto> list = new ArrayList<ReservationDto>( reservationList.size() );
        for ( Reservation reservation : reservationList ) {
            list.add( modelToDto( reservation ) );
        }

        return list;
    }
}

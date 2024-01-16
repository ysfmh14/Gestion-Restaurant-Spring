package com.example.gestionrestaurantspring.Exceptions;

public class EntityAlreadyExisteException extends RuntimeException{
    public EntityAlreadyExisteException( String message) {
        super(message);
    }
}

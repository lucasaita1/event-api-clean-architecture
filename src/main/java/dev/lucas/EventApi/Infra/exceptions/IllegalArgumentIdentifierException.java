package dev.lucas.EventApi.Infra.exceptions;

public class IllegalArgumentIdentifierException extends RuntimeException {
    public IllegalArgumentIdentifierException(String message) {
        super(message);
    }
}

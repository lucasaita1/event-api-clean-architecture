package dev.lucas.EventApi.Infra.exceptions;

public class IllegalArgumentIdentifier extends RuntimeException {
    public IllegalArgumentIdentifier(String message) {
        super(message);
    }
}

package dev.lucas.EventApi.Infra.exceptions;

public class NotFoundIdentifierException extends RuntimeException {
    public NotFoundIdentifierException(String message) {
        super(message);
    }
}

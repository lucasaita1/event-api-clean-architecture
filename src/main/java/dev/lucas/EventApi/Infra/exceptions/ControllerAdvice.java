package dev.lucas.EventApi.Infra.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(IllegalArgumentIdentifierException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateEventExceptions(IllegalArgumentIdentifierException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("Error", exception.getMessage());
        response.put("Message", "Please, insert a valid identificator for your event and try again");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundIdentifierException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateEventExceptions(NotFoundIdentifierException notFoundIdentifierException) {
        Map<String, String> response = new HashMap<>();
        response.put("Error", notFoundIdentifierException.getMessage());
        response.put("Message", "The event with was not found, please check the identifier provided");

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}

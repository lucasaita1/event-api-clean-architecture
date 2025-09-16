package dev.lucas.EventApi.Infra.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(IllegalArgumentIdentifier.class)
    public ResponseEntity<Map<String, String>> handleDuplicateEventExceptions(IllegalArgumentIdentifier exception) {
        Map<String, String> response = new HashMap<>();
        response.put("Error", exception.getMessage());
        response.put("Message", "Please, insert a valid identificator for your event and try again");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

}

package dev.lucas.EventApi.Infra.controller;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.usecases.CreateEventCase;
import dev.lucas.EventApi.Core.usecases.ListEventCase;
import dev.lucas.EventApi.Infra.dto.EventRequest;
import dev.lucas.EventApi.Infra.dto.EventResponse;
import dev.lucas.EventApi.Infra.mapper.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping ("/api/v1")
public class EventController {

    private final CreateEventCase createEventCase;
    private final ListEventCase listEventCase;

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> newEvent (@RequestBody EventRequest eventRequest){
        Event event = EventMapper.toEvent(eventRequest);
        Event createEvent = createEventCase.execute(event);
        EventMapper.toResponse(createEvent);
        Map<String, Object> response = new HashMap<>();
        response.put("Message: ", " event registered successfully!");
        response.put("Event: ", createEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<EventResponse>> getAllEvents (){
        List<Event> eventList = listEventCase.execute();
        List<EventResponse> responses = eventList.stream()
                .map(event -> EventMapper.toResponse(event))
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }

}

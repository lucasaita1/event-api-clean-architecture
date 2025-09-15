package dev.lucas.EventApi.Infra.controller;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.usecases.CreateEventCase;
import dev.lucas.EventApi.Core.usecases.ListEventCase;
import dev.lucas.EventApi.Infra.dto.EventRequest;
import dev.lucas.EventApi.Infra.dto.EventResponse;
import dev.lucas.EventApi.Infra.mapper.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping ("/api/v1")
public class EventController {

    private final CreateEventCase createEventCase;
    private final ListEventCase listEventCase;

    @PostMapping("/create")
    public EventResponse newEvent (@RequestBody EventRequest eventRequest){
        Event event = EventMapper.toEvent(eventRequest);
        Event createEvent = createEventCase.execute(event);
        return EventMapper.toResponse(createEvent);

    }

    @GetMapping
    public List<EventResponse> getAllEvents (){
        List<Event> eventList = listEventCase.execute();
        List<EventResponse> responses = eventList.stream()
                .map(event -> EventMapper.toResponse(event))
                .collect(Collectors.toList());
        return responses;
    }

}

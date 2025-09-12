package dev.lucas.EventApi.Infra.controller;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.usecases.CreateEventCase;
import dev.lucas.EventApi.Infra.dto.EventRequest;
import dev.lucas.EventApi.Infra.dto.EventResponse;
import dev.lucas.EventApi.Infra.mapper.EventMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping ("/api/v1")
public class EventController {

    private final CreateEventCase createEventCase;

    @PostMapping("/create")
    public EventResponse newEvent (@RequestBody EventRequest eventRequest){
        Event event = EventMapper.toEvent(eventRequest);
        Event createEvent = createEventCase.execute(event);
        return EventMapper.toResponse(createEvent);

    }

}

package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.gateway.EventGateway;


public class CreateEventCaseImpl implements CreateEventCase{

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return eventGateway.createEvent(event);
    }
}

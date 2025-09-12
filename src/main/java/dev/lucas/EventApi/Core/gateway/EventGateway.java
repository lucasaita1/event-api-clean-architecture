package dev.lucas.EventApi.Core.gateway;

import dev.lucas.EventApi.Core.entities.Event;

public interface EventGateway {

    public Event createEvent (Event event);
}

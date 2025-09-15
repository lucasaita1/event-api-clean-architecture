package dev.lucas.EventApi.Core.gateway;

import dev.lucas.EventApi.Core.entities.Event;

import java.util.List;

public interface EventGateway {

    public Event createEvent (Event event);

    public List<Event> listEvent ();
}

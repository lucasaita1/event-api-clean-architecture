package dev.lucas.EventApi.Core.gateway;

import dev.lucas.EventApi.Core.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    public Event createEvent (Event event);

    public List<Event> listEvent ();

    Optional<Event> findByIdentificator(String identificator);
}

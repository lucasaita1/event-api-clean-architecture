package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;

public interface CreateEventCase {

    public Event execute (Event event);
}

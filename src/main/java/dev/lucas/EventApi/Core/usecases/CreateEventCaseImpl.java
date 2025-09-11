package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;


public class CreateEventCaseImpl implements CreateEventCase{

    @Override
    public Event execute(Event event) {
        return new Event(event.id(), event.name(), event.description(), event.start(), event.finish(), event.indentificator(), event.local(), event.organization(), event.capacity(), event.type());
    }
}

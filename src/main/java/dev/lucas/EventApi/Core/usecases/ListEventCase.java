package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;

import java.util.List;

public interface ListEventCase {

    public List<Event> execute ();
}

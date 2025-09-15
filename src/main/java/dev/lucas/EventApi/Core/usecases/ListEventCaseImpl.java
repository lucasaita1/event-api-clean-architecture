package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.gateway.EventGateway;

import java.util.List;

public class ListEventCaseImpl implements ListEventCase{


    private final EventGateway eventGateway;

    public ListEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return eventGateway.listEvent();
    }
}

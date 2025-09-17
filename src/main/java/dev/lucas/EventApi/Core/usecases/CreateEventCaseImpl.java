package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.entities.IdentifierGenerator;
import dev.lucas.EventApi.Core.gateway.EventGateway;



public class CreateEventCaseImpl implements CreateEventCase{

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        String identificator = IdentifierGenerator.generate();

        Event eventWithId = new Event(
                event.id(),
                event.name(),
                event.description(),
                event.dateStart(),
                event.dateFinish(),
                identificator, // valor gerado automaticamente
                event.localEvent(),
                event.organization(),
                event.capacity(),
                event.type()
        );

        return eventGateway.createEvent(eventWithId);
    }
}

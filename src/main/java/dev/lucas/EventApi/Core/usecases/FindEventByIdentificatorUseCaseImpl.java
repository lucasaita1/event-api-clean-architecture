package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.gateway.EventGateway;

import java.util.Optional;

public class FindEventByIdentificatorUseCaseImpl implements FindEventByIdentificatorUseCase{

    private final EventGateway eventGateway;

    public FindEventByIdentificatorUseCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Optional<Event> execute(String identificator) {
        return eventGateway.findByIdentificator(identificator);
    }


}

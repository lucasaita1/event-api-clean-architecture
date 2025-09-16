package dev.lucas.EventApi.Core.usecases;

import dev.lucas.EventApi.Core.entities.Event;

import java.util.Optional;

public interface FindEventByIdentificatorUseCase {

    Optional<Event> execute(String identificator);
}

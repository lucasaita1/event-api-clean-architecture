package dev.lucas.EventApi.Infra.gateway;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.gateway.EventGateway;
import dev.lucas.EventApi.Infra.exceptions.IllegalArgumentIdentifier;
import dev.lucas.EventApi.Infra.mapper.EventEntityMapper;
import dev.lucas.EventApi.Infra.persistence.entities.EventsEntity;
import dev.lucas.EventApi.Infra.persistence.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        EventsEntity verifier = EventEntityMapper.toEntity(event);
        Optional<EventsEntity> optionalEvents = eventRepository.findByIdentificator(verifier.getIdentificator());

        if (optionalEvents.isPresent()){
            throw new IllegalArgumentIdentifier("Event already exists with this identifier!");
        }

        EventsEntity entity = EventEntityMapper.toEntity(event);
        EventsEntity newEvent = eventRepository.save(entity);
        return EventEntityMapper.toDomain(newEvent);
    }

    @Override
    public List<Event> listEvent() {
        List<EventsEntity> eventsEntities = eventRepository.findAll();
        return eventsEntities.stream()
                .map(eventsEntity -> EventEntityMapper.toDomain(eventsEntity))
                .toList();
    }

    @Override
    public Optional<Event> findByIdentificator(String identificator) {
        Optional<EventsEntity> optionalEntity = eventRepository.findByIdentificator(identificator);
        return optionalEntity.map(entity -> EventEntityMapper.toDomain(entity));
    }
}

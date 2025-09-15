package dev.lucas.EventApi.Infra.gateway;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Core.gateway.EventGateway;
import dev.lucas.EventApi.Infra.mapper.EventEntityMapper;
import dev.lucas.EventApi.Infra.mapper.EventMapper;
import dev.lucas.EventApi.Infra.persistence.entities.EventsEntity;
import dev.lucas.EventApi.Infra.persistence.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
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
}

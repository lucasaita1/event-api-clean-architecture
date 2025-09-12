package dev.lucas.EventApi.Infra.mapper;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Infra.persistence.entities.EventsEntity;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

@Component
@UtilityClass
public class EventEntityMapper {

    public static EventsEntity toEntity (Event event){
        return new EventsEntity(
                event.id(),
                event.name(),
                event.description(),
                event.dateStart(),
                event.dateFinish(),
                event.identificator(),
                event.localEvent(),
                event.capacity(),
                event.organization(),
                event.type()
        );
    }

    public static Event toDomain (EventsEntity eventsEntity){
        return new Event(
                eventsEntity.getId(),
                eventsEntity.getName(),
                eventsEntity.getDescription(),
                eventsEntity.getDateStart(),
                eventsEntity.getDateFinish(),
                eventsEntity.getIdentificator(),
                eventsEntity.getLocalEvent(),
                eventsEntity.getCapacity(),
                eventsEntity.getOrganization(),
                eventsEntity.getType());
    }
}

package dev.lucas.EventApi.Infra.mapper;

import dev.lucas.EventApi.Core.entities.Event;
import dev.lucas.EventApi.Infra.dto.EventRequest;
import dev.lucas.EventApi.Infra.dto.EventResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EventMapper {

    public static Event toEvent (EventRequest request){
        return new Event(
                request.id(),
                request.name(),
                request.description(),
                request.dateStart(),
                request.dateFinish(),
                request.identificator(),
                request.localEvent(),
                request.capacity(),
                request.organization(),
                request.type());
    }

    public static EventResponse toResponse (Event event){
        return EventResponse
                .builder()
                .id(event.id())
                .name(event.name())
                .description(event.description())
                .dateStart(event.dateStart())
                .dateFinish(event.dateFinish())
                .identificator(event.identificator())
                .localEvent(event.localEvent())
                .capacity(event.capacity())
                .organization(event.organization())
                .type(event.type())
                .build();
    }
}

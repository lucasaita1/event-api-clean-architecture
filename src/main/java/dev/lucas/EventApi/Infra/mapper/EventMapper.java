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
        return new EventResponse(
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
}

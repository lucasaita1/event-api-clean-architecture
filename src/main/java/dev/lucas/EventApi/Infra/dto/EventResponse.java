package dev.lucas.EventApi.Infra.dto;

import dev.lucas.EventApi.Core.Enums.TypeEvent;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventResponse(Long id,
                            String name,
                            String description,
                            LocalDateTime dateStart,
                            LocalDateTime dateFinish,
                            String identificator,
                            String localEvent,
                            String organization,
                            String capacity,
                            TypeEvent type) {
}

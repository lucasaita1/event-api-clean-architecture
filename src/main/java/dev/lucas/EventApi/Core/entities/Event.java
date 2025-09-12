package dev.lucas.EventApi.Core.entities;

import dev.lucas.EventApi.Core.Enums.TypeEvent;

import java.time.LocalDateTime;

public record Event(Long id,
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

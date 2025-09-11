package dev.lucas.EventApi.Core.entities;

import dev.lucas.EventApi.Core.Enums.TypeEvent;

import java.time.LocalDateTime;

public record Event(Long id,
                    String name,
                    String description,
                    LocalDateTime start,
                    LocalDateTime finish,
                    String indentificator,
                    String localEvent,
                    String organization,
                    String capacity,
                    TypeEvent type) {
}

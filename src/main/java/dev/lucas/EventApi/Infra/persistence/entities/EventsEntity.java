package dev.lucas.EventApi.Infra.persistence.entities;

import dev.lucas.EventApi.Core.Enums.TypeEvent;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Events")
public class EventsEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateStart;
    private LocalDateTime dateFinish;
    private String identificator;
    private String localEvent;
    private String organization;
    private String capacity;
    @Enumerated(EnumType.STRING)
    private TypeEvent type;

}

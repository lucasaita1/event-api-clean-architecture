package dev.lucas.EventApi.Infra.persistence;

import dev.lucas.EventApi.Core.Enums.TypeEvent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    private String indentificator;
    private String localEvent;
    private String organization;
    private String capacity;
    private TypeEvent type;

}

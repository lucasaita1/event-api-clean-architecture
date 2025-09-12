package dev.lucas.EventApi.Infra.persistence.repository;

import dev.lucas.EventApi.Infra.persistence.entities.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventsEntity, Long> {
}

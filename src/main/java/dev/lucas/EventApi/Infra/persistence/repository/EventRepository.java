package dev.lucas.EventApi.Infra.persistence.repository;

import dev.lucas.EventApi.Infra.persistence.entities.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventsEntity, Long> {
    
    public Optional<EventsEntity> findByIdentificator (String identificator);
}

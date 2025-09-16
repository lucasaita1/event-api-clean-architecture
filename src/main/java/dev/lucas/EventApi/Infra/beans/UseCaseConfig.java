package dev.lucas.EventApi.Infra.beans;

import dev.lucas.EventApi.Core.gateway.EventGateway;
import dev.lucas.EventApi.Core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway) {
        return new CreateEventCaseImpl(eventGateway);
    }

    @Bean
    public ListEventCase listEventCase (EventGateway eventGateway){
        return new ListEventCaseImpl(eventGateway);
    }

    @Bean
    public FindEventByIdentificatorUseCase findEventByIdentificatorUseCase(EventGateway eventGateway) {
        return new FindEventByIdentificatorUseCaseImpl(eventGateway);
    }
}


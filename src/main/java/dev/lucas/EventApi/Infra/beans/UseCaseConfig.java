package dev.lucas.EventApi.Infra.beans;

import dev.lucas.EventApi.Core.gateway.EventGateway;
import dev.lucas.EventApi.Core.usecases.CreateEventCase;
import dev.lucas.EventApi.Core.usecases.CreateEventCaseImpl;
import dev.lucas.EventApi.Core.usecases.ListEventCase;
import dev.lucas.EventApi.Core.usecases.ListEventCaseImpl;
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
}


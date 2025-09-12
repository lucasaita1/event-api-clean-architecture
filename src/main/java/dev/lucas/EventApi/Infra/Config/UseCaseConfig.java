package dev.lucas.EventApi.Infra.Config;

import dev.lucas.EventApi.Core.gateway.EventGateway;
import dev.lucas.EventApi.Core.usecases.CreateEventCase;
import dev.lucas.EventApi.Core.usecases.CreateEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway) {
        return new CreateEventCaseImpl(eventGateway);
    }
}


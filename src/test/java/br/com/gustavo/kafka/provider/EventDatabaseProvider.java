package br.com.gustavo.kafka.provider;

import br.com.gustavo.kafka.dto.EventDatabaseDto;
import br.com.gustavo.kafka.model.EventDatbase;

public class EventDatabaseProvider {
    public static final EventDatbase EVENT_DATABASE = EventDatbase.builder()
            .id(1L)
            .project("project-test")
            .addedLines(5)
            .removedLines(5)
            .build();

    public static final EventDatbase EVENT_DATABASE_2 = EventDatbase.builder()
            .id(1L)
            .project("project-test")
            .addedLines(10)
            .removedLines(10)
            .build();

    public static final EventDatabaseDto EVENT_DATABASE_DTO = EventDatabaseDto.builder()
            .modifiedLines(30)
            .build();
}

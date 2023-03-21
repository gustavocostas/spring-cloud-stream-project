package br.com.gustavo.kafka.repository;

import br.com.gustavo.kafka.model.EventDatbase;

import java.util.List;

public interface EventDatabaseRepository {
    EventDatbase saveEvent(EventDatbase eventDatbase);
    List<EventDatbase> findAllById(Long id);
}

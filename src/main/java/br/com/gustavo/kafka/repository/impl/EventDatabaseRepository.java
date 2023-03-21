package br.com.gustavo.kafka.repository.impl;

import br.com.gustavo.kafka.model.EventDatbase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class EventDatabaseRepository implements br.com.gustavo.kafka.repository.EventDatabaseRepository {
    private RepositorySpringData repositorySpringData;

    EventDatabaseRepository(final RepositorySpringData repositorySpringData) {
        this.repositorySpringData = repositorySpringData;
    }

    @Override
    public EventDatbase saveEvent(EventDatbase eventDatbase) {
        return repositorySpringData.save(eventDatbase);
    }

    @Override
    public List<EventDatbase> findAllById(Long id) {
        return repositorySpringData.findAllById(Collections.singleton(id));
    }


    private interface RepositorySpringData extends JpaRepository<EventDatbase, Long> {
    }
}

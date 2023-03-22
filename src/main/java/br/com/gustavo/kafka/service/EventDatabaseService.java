package br.com.gustavo.kafka.service;

import br.com.gustavo.kafka.dto.EventDatabaseDto;
import br.com.gustavo.kafka.model.EventDatbase;
import br.com.gustavo.kafka.repository.EventDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventDatabaseService {

    @Autowired
    EventDatabaseRepository eventDatabaseRepository;

    public void saveEvent(EventDatbase eventDatbase) {
        eventDatabaseRepository.saveEvent(eventDatbase);
    }

    public EventDatabaseDto returnEvent(Long id) {
        List<EventDatbase> listOfEventDatbases = listAllEventsById(id);
        return EventDatabaseDto.builder()
                .modifiedLines(calculateLines(listOfEventDatbases))
                .build();
    }

    private List<EventDatbase> listAllEventsById(Long id) {
        return eventDatabaseRepository.findAllById(id);
    }

    private Integer calculateLines(List<EventDatbase> eventDatbases) {
        return eventDatbases.isEmpty() ? 0
                : eventDatbases.stream().map(EventDatbase::returnModifiedLines)
                .reduce(0, Integer::sum) / 2;
    }
}

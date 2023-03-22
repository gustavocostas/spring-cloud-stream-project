package br.com.gustavo.kafka.service;

import br.com.gustavo.kafka.dto.EventDatabaseDto;
import br.com.gustavo.kafka.model.EventDatbase;
import br.com.gustavo.kafka.repository.EventDatabaseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static br.com.gustavo.kafka.provider.EventDatabaseProvider.EVENT_DATABASE;
import static br.com.gustavo.kafka.provider.EventDatabaseProvider.EVENT_DATABASE_2;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EventDatabaseServiceTest {
    @Mock
    private EventDatabaseRepository eventDatabaseRepository;

    @InjectMocks
    private EventDatabaseService eventDatabaseService;

    @Test
    void saveEvent() {
        eventDatabaseService.saveEvent(EVENT_DATABASE);

        verify(eventDatabaseRepository, times(1)).saveEvent(EVENT_DATABASE);
    }

    @Test
    void returnEvent() {
        List<EventDatbase> list = new ArrayList<>();

        list.add(EVENT_DATABASE);
        list.add(EVENT_DATABASE_2);

        when(eventDatabaseRepository.findAllById(1L)).thenReturn(list);

        EventDatabaseDto eventDatabaseDto = eventDatabaseService.returnEvent(1L);

        assertEquals(15, eventDatabaseDto.getModifiedLines());
    }
}
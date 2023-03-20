package br.com.gustavo.kafka.service;

import br.com.gustavo.kafka.model.FakeEvent;
import br.com.gustavo.kafka.producer.FakeEventProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FakeEventService {
    @Autowired
    private FakeEventProducer fakeEventProducer;

    public void sendMessage(FakeEvent fakeEvent) {
        fakeEventProducer.sendMessage(fakeEvent);
        log.info("Evento produzido: " + fakeEvent.toString());
    }
}

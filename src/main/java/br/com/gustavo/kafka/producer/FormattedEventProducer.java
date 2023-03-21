package br.com.gustavo.kafka.producer;

import br.com.gustavo.kafka.dto.FormattedEvent;
import br.com.gustavo.kafka.model.FakeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import static br.com.gustavo.kafka.mapper.FakeEventMapper.toFormattedEvent;

@Component
@Slf4j
public class FormattedEventProducer {
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(FakeEvent fakeEvent) {
        if (fakeEvent.getAction().equals("merge")) {
            FormattedEvent formatted = toFormattedEvent(fakeEvent);
            streamBridge.send("topic-final", formatted);
            log.info("Evento produzido: " + formatted.toString());
        }
    }
}

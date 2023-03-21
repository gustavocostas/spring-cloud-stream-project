package br.com.gustavo.kafka.messaging.producer;

import br.com.gustavo.kafka.messaging.dto.FormattedEventDto;
import br.com.gustavo.kafka.messaging.model.FakeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import static br.com.gustavo.kafka.messaging.mapper.FakeEventMapper.toFormattedEventDto;

@Component
@Slf4j
public class FormattedEventProducer {
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(FakeEvent fakeEvent) {
        if (fakeEvent.getAction().equals("merge")) {
            FormattedEventDto formatted = toFormattedEventDto(fakeEvent);
            streamBridge.send("topic-final", formatted);
            log.info("Evento produzido: " + formatted.toString());
        }
    }
}

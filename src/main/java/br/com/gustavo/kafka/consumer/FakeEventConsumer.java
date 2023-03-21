package br.com.gustavo.kafka.consumer;

import br.com.gustavo.kafka.model.FakeEvent;
import br.com.gustavo.kafka.producer.FormattedEventProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class FakeEventConsumer implements Consumer<FakeEvent> {
    @Autowired
    private FormattedEventProducer formattedEventProducer;

    @Override
    public void accept(FakeEvent fakeEvent) {
        formattedEventProducer.sendMessage(fakeEvent);
        log.info("Evento consumido: " + fakeEvent.toString());
    }
}

package br.com.gustavo.kafka.producer;

import br.com.gustavo.kafka.model.FakeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class FakeEventProducer {
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(FakeEvent fakeEvent) {
        streamBridge.send("topic-test", fakeEvent);
    }

}
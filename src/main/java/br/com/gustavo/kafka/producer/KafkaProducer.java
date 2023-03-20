package br.com.gustavo.kafka.producer;

import br.com.gustavo.kafka.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(Person person) {
        streamBridge.send("topic-test", person);
    }

}

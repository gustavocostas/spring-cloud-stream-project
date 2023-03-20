package br.com.gustavo.kafka.controller;

import br.com.gustavo.kafka.model.Person;
import br.com.gustavo.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;
    @PostMapping("/send-message")
    public void sendMessage(@RequestBody Person person) {
        kafkaProducer.sendMessage(person);
    }
}

package br.com.gustavo.kafka.controller;

import br.com.gustavo.kafka.messaging.model.FakeEvent;
import br.com.gustavo.kafka.messaging.service.FakeEventService;
import br.com.gustavo.kafka.service.EventDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static br.com.gustavo.kafka.messaging.mapper.FakeEventMapper.toEvent;

@RestController
@RequestMapping("/mycontroller")
public class FakeEventController {
    @Autowired
    private FakeEventService fakeEventService;

    @Autowired
    private EventDatabaseService eventDatabaseService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody FakeEvent fakeEvent) {
        eventDatabaseService.saveEvent(toEvent(fakeEvent));
        fakeEventService.sendMessage(fakeEvent);
    }
}

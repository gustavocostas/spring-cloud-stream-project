package br.com.gustavo.kafka.controller;

import br.com.gustavo.kafka.model.FakeEvent;
import br.com.gustavo.kafka.service.FakeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class FakeEventController {
    @Autowired
    private FakeEventService fakeEventService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody FakeEvent fakeEvent) {
        fakeEventService.sendMessage(fakeEvent);
    }
}

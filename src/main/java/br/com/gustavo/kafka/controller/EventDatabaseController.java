package br.com.gustavo.kafka.controller;

import br.com.gustavo.kafka.dto.EventDatabaseDto;
import br.com.gustavo.kafka.service.EventDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/database")
public class EventDatabaseController {
    @Autowired
    private EventDatabaseService eventDatabaseService;

    @GetMapping("/{id}")
    public ResponseEntity<EventDatabaseDto> getMessage(@PathVariable Long id) {
        return ResponseEntity.ok(eventDatabaseService.returnEvent(id));
    }
}

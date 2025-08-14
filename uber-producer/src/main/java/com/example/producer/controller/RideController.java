package com.example.producer.controller;

import com.example.producer.dto.RideMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Value("${kafka.topic.name}")
    private String topic;

    public RideController(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    // simple GET to verify producer app is up
    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Producer running. Use POST/PUT/DELETE to send messages.");
    }

    @PostMapping
    public ResponseEntity<String> createRide(@RequestBody RideMessage msg) throws Exception {
        msg.setOperation("CREATE");
        String json = objectMapper.writeValueAsString(msg);
        kafkaTemplate.send(topic, json);
        return ResponseEntity.ok("CREATE message sent to Kafka");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRide(@PathVariable Long id, @RequestBody RideMessage msg) throws Exception {
        msg.setId(id);
        msg.setOperation("UPDATE");
        kafkaTemplate.send(topic, objectMapper.writeValueAsString(msg));
        return ResponseEntity.ok("UPDATE message sent to Kafka");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRide(@PathVariable Long id) throws Exception {
        RideMessage m = new RideMessage();
        m.setId(id);
        m.setOperation("DELETE");
        kafkaTemplate.send(topic, objectMapper.writeValueAsString(m));
        return ResponseEntity.ok("DELETE message sent to Kafka");
    }
}

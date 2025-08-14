package com.example.producer.service;

import com.example.producer.dto.RideMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RideProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Value("${kafka.topic.name}")
    private String topic;

    public RideProducerService(KafkaTemplate<String, String> kafkaTemplate,
                                ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void sendMessage(RideMessage msg) throws Exception {
        String jsonMessage = objectMapper.writeValueAsString(msg);
        kafkaTemplate.send(topic, jsonMessage);
        System.out.println("✅ Message sent to Kafka: " + jsonMessage);
    }
}

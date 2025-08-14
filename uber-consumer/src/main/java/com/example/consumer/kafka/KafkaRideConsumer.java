package com.example.consumer.kafka;

import com.example.consumer.model.Ride;
import com.example.consumer.repository.RideRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaRideConsumer {

    private final RideRepository rideRepository;
    private final ObjectMapper objectMapper;

    public KafkaRideConsumer(RideRepository rideRepository, ObjectMapper objectMapper) {
        this.rideRepository = rideRepository;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "uber-ride-topic", groupId = "uber-group")
    public void consume(String message) throws Exception {
        System.out.println("Received message: " + message);

        RideMessage rideMsg = objectMapper.readValue(message, RideMessage.class);

        switch (rideMsg.getOperation()) {
            case "CREATE" -> {
                Ride ride = new Ride(
                    rideMsg.getDriverName(),
                    rideMsg.getPickupLocation(),
                    rideMsg.getDropLocation(),
                    "CREATED"
                );
                rideRepository.save(ride);
            }
            case "UPDATE" -> {
                Ride existingRide = rideRepository.findById(rideMsg.getId()).orElse(null);
                if (existingRide != null) {
                    existingRide.setDriverName(rideMsg.getDriverName());
                    existingRide.setPickupLocation(rideMsg.getPickupLocation());
                    existingRide.setDropLocation(rideMsg.getDropLocation());
                    existingRide.setStatus("UPDATED");
                    rideRepository.save(existingRide);
                }
            }
            case "DELETE" -> rideRepository.deleteById(rideMsg.getId());
        }
    }
}

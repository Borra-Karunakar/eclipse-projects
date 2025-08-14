package com.example.deliveryclient.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private static final Logger log = LoggerFactory.getLogger(DeliveryService.class);

    private final RestTemplate restTemplate;

    @Value("${external.api.url}")
    private String externalApiUrl;

    public DeliveryService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // name = deliveryService corresponds to properties in application.properties
    @CircuitBreaker(name = "deliveryService", fallbackMethod = "getDeliveryStatusFallback")
    public String getDeliveryStatus() {
        log.info("Calling external API: {}", externalApiUrl);
        // if external host is down this will throw a RestClientException -> fallback
        return restTemplate.getForObject(externalApiUrl, String.class);
    }

    // fallback method signature: same return type, same parameters (none here) + Throwable
    public String getDeliveryStatusFallback(Throwable t) {
        log.warn("Fallback triggered for deliveryService: {}", t == null ? "unknown" : t.toString());
        return "FALLBACK: Delivery service is currently unavailable. Please try again later.";
    }
}

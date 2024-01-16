package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerService {

    @KafkaListener(topics = "kafkaTopic", groupId = "group_id")
    public void consume(String message) {
        log.info("--> Consumed message: {}", message);
    }
}

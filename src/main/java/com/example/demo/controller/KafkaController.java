package com.example.demo.controller;

import com.example.demo.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final ProducerService producerService;

    @PostMapping
    public void publishMessage(@RequestParam String message) {
        producerService.sendMessage(message);
    }
}

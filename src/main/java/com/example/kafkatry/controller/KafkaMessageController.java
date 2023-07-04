package com.example.kafkatry.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class KafkaMessageController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaMessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public void publish(@RequestBody MessageRequest request){

        kafkaTemplate.send("hanan", request.data());

    }
}

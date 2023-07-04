package com.example.kafkatry.Listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "hanan",
    groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received:  " + data);

    }
}

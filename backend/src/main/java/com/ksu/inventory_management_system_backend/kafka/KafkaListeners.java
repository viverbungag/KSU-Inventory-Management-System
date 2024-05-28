package com.ksu.inventory_management_system_backend.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "KsuTopic", groupId = "group_id")
    void listener(String data) {
        System.out.println("Received Messasge in group_id: " + data);
    }
}

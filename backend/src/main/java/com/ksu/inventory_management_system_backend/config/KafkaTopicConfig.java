package com.ksu.inventory_management_system_backend.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic KsuTopic() {
        return TopicBuilder
                .name("KsuTopic")
                .build();
    }
}

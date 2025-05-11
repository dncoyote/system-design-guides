package com.dncoyote.producer;


import com.dncoyote.kafka.avro.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserActivityProducer {

    private static final String TOPIC = "user-activity-topic";

    @Autowired
    private KafkaTemplate<String, UserActivity> kafkaTemplate;

    public void send(String userId, String action) {
        UserActivity event = new UserActivity(userId, action, LocalDateTime.now().toString());
        kafkaTemplate.send(TOPIC, userId, event);
    }
}


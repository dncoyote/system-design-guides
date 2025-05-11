package com.dncoyote.consumer;


import com.dncoyote.kafka.avro.UserActivity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserActivityConsumer {

    @KafkaListener(topics = "user-activity-topic", groupId = "user-activity-consumer")
    public void consume(UserActivity activity) {
        System.out.println("🔔 Received User Activity:");
        System.out.printf("User ID: %s | Action: %s | Timestamp: %s%n",
                activity.getUserId(), activity.getAction(), activity.getTimestamp());
    }
}


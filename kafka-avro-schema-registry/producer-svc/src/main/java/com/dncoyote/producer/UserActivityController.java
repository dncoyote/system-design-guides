package com.dncoyote.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publish")
public class UserActivityController {

    @Autowired
    private UserActivityProducer producer;

    @PostMapping
    public String publish(@RequestParam String userId, @RequestParam String action) {
        producer.send(userId, action);
        return "Event published for user: " + userId;
    }
}


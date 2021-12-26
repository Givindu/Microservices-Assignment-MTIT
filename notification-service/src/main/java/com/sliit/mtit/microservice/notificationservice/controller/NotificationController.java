package com.sliit.mtit.microservice.notificationservice.controller;

import com.sliit.mtit.microservice.notificationservice.dto.NotificationRequest;
import com.sliit.mtit.microservice.notificationservice.dto.NotificationResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody NotificationResponse createNotification(@RequestBody NotificationRequest notificationRequest){

        System.out.println("Notification Details : "+ notificationRequest);

        var notificationResponse = new NotificationResponse();
        notificationResponse.setNotificationId(UUID.randomUUID().toString());
        notificationResponse.setMessage("Successfully created the Notification");

        return notificationResponse;

    }
}

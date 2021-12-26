package com.sliit.mtit.microservice.promotionservice.service;

import com.sliit.mtit.microservice.promotionservice.dto.NotificationCreationRequest;
import com.sliit.mtit.microservice.promotionservice.dto.NotificationCreationResponse;
import com.sliit.mtit.microservice.promotionservice.dto.PromotionRequest;
import com.sliit.mtit.microservice.promotionservice.dto.PromotionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PromotionServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public PromotionResponse createPromotion(PromotionRequest promotionRequest){

        var notificationCreationRequest = new NotificationCreationRequest();
        notificationCreationRequest.setProductName(promotionRequest.getProductName());
        notificationCreationRequest.setPromotionPercentage(promotionRequest.getPromotionPercentage());
        notificationCreationRequest.setPromotionDetails(promotionRequest.getPromotionDetails());
        ResponseEntity<NotificationCreationResponse> notificationCreationResponse = restTemplate.postForEntity("http://localhost:8080/notifications",notificationCreationRequest, NotificationCreationResponse.class);

        var promotionResponse = new PromotionResponse();
        promotionResponse.setPromotionId(UUID.randomUUID().toString());
        promotionResponse.setNotificationId(notificationCreationResponse.getBody().getNotificationId());
        promotionResponse.setMessage("Successfully created the promotion");

        return promotionResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}

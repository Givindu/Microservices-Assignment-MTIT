package com.sliit.mtit.microservice.promotionservice.controller;

import com.sliit.mtit.microservice.promotionservice.dto.PromotionRequest;
import com.sliit.mtit.microservice.promotionservice.dto.PromotionResponse;
import com.sliit.mtit.microservice.promotionservice.service.PromotionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    private PromotionServiceImpl promotionService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody PromotionResponse createPromotion(@RequestBody PromotionRequest request){

        System.out.println("Promotion Details : "+ request);
        return promotionService.createPromotion(request);

    }

}

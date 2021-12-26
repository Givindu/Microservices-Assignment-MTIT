package com.sliit.mtit.microservice.promotionservice.dto;

public class NotificationCreationRequest {

    private String productName;
    private String promotionPercentage;
    private String promotionDetails;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPromotionPercentage() {
        return promotionPercentage;
    }

    public void setPromotionPercentage(String promotionPercentage) {
        this.promotionPercentage = promotionPercentage;
    }

    public String getPromotionDetails() {
        return promotionDetails;
    }

    public void setPromotionDetails(String promotionDetails) {
        this.promotionDetails = promotionDetails;
    }
}

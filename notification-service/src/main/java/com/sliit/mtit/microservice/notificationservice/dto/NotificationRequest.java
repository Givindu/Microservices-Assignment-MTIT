package com.sliit.mtit.microservice.notificationservice.dto;

public class NotificationRequest {

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

    @Override
    public String toString() {
        return "NotificationRequest{" +
                "productName='" + productName + '\'' +
                ", promotionPercentage='" + promotionPercentage + '\'' +
                ", promotionDetails='" + promotionDetails + '\'' +
                '}';
    }
}

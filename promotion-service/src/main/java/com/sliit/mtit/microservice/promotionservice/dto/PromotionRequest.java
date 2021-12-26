package com.sliit.mtit.microservice.promotionservice.dto;

public class PromotionRequest {

    private String productName;
    private String promotionPercentage;
    private String oldPrice;
    private String newPrice;
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

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getPromotionDetails() {
        return promotionDetails;
    }

    public void setPromotionDetails(String promotionDetails) {
        this.promotionDetails = promotionDetails;
    }

    @Override
    public String toString() {
        return "PromotionRequest{" +
                "productName='" + productName + '\'' +
                ", promotionPercentage='" + promotionPercentage + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", newPrice='" + newPrice + '\'' +
                ", promotionDetails='" + promotionDetails + '\'' +
                '}';
    }
}

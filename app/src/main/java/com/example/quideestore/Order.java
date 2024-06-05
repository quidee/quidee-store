package com.example.quideestore;

public class Order {
    private String status;
    private String price;
    private String title;
    private String detail;
    private String code;
    private String placeOrderTime;
    private String deliveryEstimate;


    public Order(String status, String price, String title, String detail, String code, String placeOrderTime, String deliveryEstimate) {
        this.status = status;
        this.price = price;
        this.title = title;
        this.detail = detail;
        this.code = code;
        this.placeOrderTime = placeOrderTime;
        this.deliveryEstimate = deliveryEstimate;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPlaceOrderTime() {
        return placeOrderTime;
    }

    public void setPlaceOrderTime(String placeOrderTime) {
        this.placeOrderTime = placeOrderTime;
    }

    public String getDeliveryEstimate() {
        return deliveryEstimate;
    }

    public void setDeliveryEstimate(String deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }
}


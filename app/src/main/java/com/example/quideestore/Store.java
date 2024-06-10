package com.example.quideestore;

public class Store {
    private final String name;
    private final String rating;
    private final String deliveryTime;
    private final int imageResource;

    public Store(String name, String rating, String deliveryTime, int imageResource) {
        this.name = name;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public int getImageResource() {
        return imageResource;
    }
}

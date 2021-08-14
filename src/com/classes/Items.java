package com.classes;

public class Items {
    private String itemName;
    private float cost;
    private float quantity;
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public float getCost() {
        return cost;
    }

    public float getQuantity() {
        return quantity;
    }

    public Items(String itemName, float cost) {
        this.itemName = itemName;
        this.cost = cost;
    }

    public Items(String itemName, float cost, float quantity) {
        this.itemName = itemName;
        //  this.cost = cost;
        this.quantity = quantity;
    }
}

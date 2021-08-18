package com.classes;

public class Items {
    private String itemName;
    private float cost;
    private int quantity;
    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public int getQuantity()
    {
        return quantity;
    }

    public Items(String itemName, float cost) {
        this.itemName = itemName;
        this.cost = cost;
    }

    public Items(String itemName,  int quantity) {
        this.itemName = itemName;
        //  this.cost = cost;
        this.quantity = quantity;
    }
}

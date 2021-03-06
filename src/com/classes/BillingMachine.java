package com.classes;

public class BillingMachine {
    Items[] items = new Items[5];
    private int bmNo;
    int count = 0;

    public BillingMachine(int bmNo) {
        this.bmNo = bmNo;
    }

    public int getBmNo() {
        return bmNo;
    }

// Menu method

    public void menu() {
        System.out.println("(1)\tAdd Items\n(2)\tDisplay Items\n(3)\tAdd Quantity\n(4)\tFinal Amount\n(5)\tExit");
    }

//1.AddItem Method

    public boolean addItem(String name, float cost) {

        if (isAvailable(name, cost)) {
            System.out.println("The item is already Added");
            return false;
        }
        if (count >= items.length) {
            System.out.println("You do not Sufficient Space");
            return false;
        }

        items[count] = new Items(name, cost);
        count++;
        System.out.println("The Item has added successfully");
        return true;
    }

    // Is Available method

    public boolean isAvailable(String name, float cost) {
        for (Items item :
                items) {
            if (item != null && item.getItemName().equals(name) && item.getItemName() != null) {
                return true;
            }
        }
        return false;
    }

    // 2. Display Method
    public void displayItems() {
        int a = 1;
        System.out.println("Serial No.\t\tItem name\t\tCost");
        for (Items item :
                items) {
            if (item != null)
                System.out.println("\t\t" + a++ + "\t\t\t" + item.getItemName() + "\t\t\t" + item.getCost());


        }
    }

// Add Quantity

    public boolean addQuantity(String name, int quantity) {
        if (checkItem(name)) {
            for (Items item : items)
                if(item != null)
                item.setQuantity(quantity);
            System.out.println("The quantity added successfully");
            return false;
        }
        if (count >= items.length) {
            System.out.println("You do not have sufficient space to add quantity");
            return false;
        }
        items[count] = new Items(name, quantity);
        count++;
        return true;
    }
    // Payment Details

    public void paymentDetails() {
        System.out.println("Serial no\tItem Name\t\tCost\t\tQuantity\tFinal amount");
        int x = 0;


        for (Items item :
                items) {
            if (item != null) {
                item.setAmount(item.getCost() * item.getQuantity());
                System.out.println("\t" + x++ + "\t\t\t" + item.getItemName() + "\t\t\t" + item.getCost() + "\t\t\t" + item.getQuantity()
                        + "\t\t\t" + item.getQuantity());
            }

        }
    }

    public boolean checkItem(String name) {
        for (Items item :
                items) {
            if (item != null && item.getItemName() != null && item.getItemName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}

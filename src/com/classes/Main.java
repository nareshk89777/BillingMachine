package com.classes;

import java.util.*;

public class Main {
    static BillingMachine bm1 = new BillingMachine(101);

    public static void main(String[] args) {
        bm1.menu();
        Scanner ss = new Scanner(System.in);
        int num = ss.nextInt();
        while (num != 5) {
            options(num);
            bm1.menu();
            num = ss.nextInt();
        }


    }

    static void options(int num) {
        Scanner ss = new Scanner(System.in);
        switch (num) {

            case 1:
                System.out.println("Enter Item Name");
                String name = ss.next();
                System.out.println("Enter cost of Item");
                float cost = ss.nextFloat();
                bm1.addItem(name, cost);
                break;
            case 2:
                bm1.displayItems();
                break;
            case 3:
                System.out.println("Enter Item name");
                name = ss.next();
                System.out.println("Enter Item quantity");
                float quantity = ss.nextFloat();
                bm1.addQuantity(name, quantity);
                break;
            case 4:
                System.out.println("Details of Payment");
                bm1.paymentDetails();
                break;
            default:
                System.out.println("Please choose Appropriate Option");
        }


    }


}



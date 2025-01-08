package org.example;

public class Item {

    String type;
    int amount;

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        item1.type = "매출";
        item1.amount = 32000;

        item2.type = "알바비";
        item2.amount = 10000;


    }
}

package org.example;

public class MoneyBank {
    public static void main(String[] args) {

        double money = 100; //유지하는 값
        double rate = 0.2; //2%의 금리

        //10년 거치
        for (int i = 0; i < 10; i++) {

            double interest = money * rate;

            money = money + interest; //변동하는 값
            System.out.println("      " + money);

        }//end for

    }
}

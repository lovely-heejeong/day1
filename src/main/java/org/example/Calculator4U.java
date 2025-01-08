package org.example;

import java.util.Scanner;

public class Calculator4U {

    public static void main(String[] args) {
        //scanner 필요
        Scanner scanner = new Scanner(System.in);

        int sum = 0; //계속 유지해야 하는 데이터

        //몇 번일지 모름
        while(true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();

            if(str.equals("END")){
                break;
            } //end if

            int money = Integer.parseInt(str);
            sum = sum + money;

            System.out.println("SUM : " + sum);

        }//end while

    }
}

package org.example;

import java.util.Scanner;

public class Calculator4UNewVer {

    public static void main(String[] args) {

        //Scanner 필요
        Scanner scanner = new Scanner(System.in);
        //계속유지 해야 하는 데이터
        int sum = 0;

        int before = 0;

        //몇번일지 몰라
        while(true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();

            if(str.equals("END")){
                break;
            }

            if(str.equals("R")){
                sum -= before;
                continue;
            }

            int money = Integer.parseInt(str);
            sum = sum + money;

            before = money;

            System.out.println("SUM :" + sum);

        }//end while
    }
}

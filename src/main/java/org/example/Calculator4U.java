package org.example;

import java.util.Scanner;

public class Calculator4U {

    public static void main(String[] args) {
        //변수: Scanner 필요
        Scanner scanner = new Scanner(System.in);

        int sum = 0; //계속 유지해야 하는 데이터는 범위 밖에 선언하기

        //로직: 빈복문, 입력 받기 -> 숫자로
        //몇 번일지 모르니까 while(true)
        while(true){
            System.out.println("Insert Value");
            String str = scanner.nextLine();

            if(str.equals("END")){ //equals -> true/false를 따지니까 if 사용가능
                break;
            }//end if

            int money = Integer.parseInt(str); //키보드에서 입려 받는게 숫자니까 변환
            sum = sum + money; //살아 있어야 되는 변수 => 범위 밖에

            System.out.println("SUM : " + sum);

        }//end while

    }
}

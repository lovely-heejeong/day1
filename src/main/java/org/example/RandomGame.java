package org.example;

import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        //Scanner 필요
       Scanner scanner = new Scanner(System.in);

        //당첨값 필요 - 랜덤값, 0부터 5까지
        int value = (int)(Math.random() * 6);

        //반복하기
        //for문 반복이 어디까지인지 확인하고 싶으면 breakpoint(빨간점) + Debug
        for (int i = 0; i < 6; i++){
            System.out.println("i ------" + i);
            scanner.nextLine(); //키보드에서 enter 칠 때까지 기다림

            if(value == i){
                System.out.println("당첨");
                break; //당첨되고 나면 루프 돌 필요가 없으니까 break
            }

        }//end for

    }
}

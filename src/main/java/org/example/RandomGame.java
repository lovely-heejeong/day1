package org.example;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);//Scanner 필요

        int value = (int)(Math.random() * 6); //당첨값 - 랜덤 0부터 5까지 만들어짐

        //반복하기
        for (int i = 0; i < 6; i++){
            System.out.println("i ------" + i);
            scanner.nextLine(); //키보드에서 enter 칠 때까지 기다림

            if(value == i){
                System.out.println("당첨");
                break;
            }

        }//end for

    }
}

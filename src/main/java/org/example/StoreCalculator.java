package org.example;

import java.util.Scanner;

public class StoreCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 원하는 길이를 입력하세요 (숫자)");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("배열에 값을 입력하세요.");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i +"]=");
            arr[i] = scanner.nextInt();
        }

        int total = 0;

        for (int value: arr){
            total += value;
            System.out.println("배열의 값은 " + total +"입니다.");
        }

//        int[] arr = new int[5];
//
//        arr[0] = 32000;
//        arr[1] = -5000;
//        arr[2] = -1000;
//        arr[3] = 9000;
//        arr[4] = -2000;
//
//        int total = 0;
//
//        for (int value: arr){
//            total += value;
//            System.out.println("최종 금액은 " + total +"입니다.");
//        }


    }

}

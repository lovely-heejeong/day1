package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        //세 명의 학생의 국영수 점수를 받아서 국어 평균, 영어 평균, 수학 평균 점수를 출력하기
        Scanner sc = new Scanner(System.in);

        int[][] scoreInfo = new int[2][3];

        for(int i = 0; i < scoreInfo.length; i++) {
            int[] score = new int[3];
            for(int j = 0; j < score.length; j++) {
                System.out.println("점수 입력 : ");
                int number = sc.nextInt();
                score[j] = number;
            }
            scoreInfo[i] = score;
        }

        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;
        for(int i=0; i < scoreInfo.length; i++){
            System.out.println("겉 배열");
            korSum += scoreInfo[i][0];
            engSum += scoreInfo[i][1];
            mathSum += scoreInfo[i][2];
            // for (int j = 0; j < scoreInfo[i].length; j++) {
            //     System.out.println("\t 속 배열");
            //     System.out.println("\t\t"+ scoreInfo[i][j]);
            // }
        }

        System.out.println(korSum / (double) scoreInfo.length);
        System.out.println(engSum / (double) scoreInfo.length);
        System.out.println(mathSum / (double) scoreInfo.length);
    }
}

package org.example;

import java.util.Scanner;

public class RPSGame2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //연속 승리 기록: 값 유지
        int series = 0;

        while(true){

            if(series == 3) {
                System.out.println("3연승 달성 성공");
                break;
            }

            System.out.println("현재 연승 기록: " + series);
            System.out.println("가위0, 바위1, 보자기2 입력하세요");
            String str = scanner.nextLine(); //키보드에서 입력한 문자열
            System.out.println(str);

            int user = Integer.parseInt(str);
            //컴 값 0,1,2
            int com = (int) (Math.random() * 3);

            if(user < com) {
                user = user + 3;
            }//end if

            int result = user - com; //0,1,2

            System.out.println("USER: " + user);
            System.out.println("COM: " + com);

            switch (result){
                case 0:
                    System.out.println("비김");
                    break;
                case 1:
                    System.out.println("이김");
                    series += 1; //사용자가 이기면 값이 변경되야 하므로 { } 안쪽에, series = series + 1을 줄여서 씀
                    break;
                case 2:
                    System.out.println("졌다");
                    series = 0;
                    break;
            }//end switch

        }//end while

    }
}
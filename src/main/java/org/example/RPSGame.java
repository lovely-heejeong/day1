package org.example;

import java.util.Scanner;

public class RPSGame {

    public static void main(String[] args) {
        //필요한 것: 사용자값, 컴값, 결과 => 변수 3개
        //컴값과 결과 사이에 조건 => 부등호가 나오니까 if
        //결과의 경우 => 0,1,2 이미 값이 있으니까 switch

        //순서: 변수 (int user/com) => 제어문 (if, switch) => 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위0, 바위1, 보2 입력하세요");
        //코드를 실행하면 아래 라인에서 입력을 받기위해 대기

        String str = scanner.nextLine(); //키보드에서 입력한 문자열
        System.out.println(str);

        int user = Integer.parseInt(str); //사용자값
        int com = (int) (Math.random() * 3); //컴값 0,1,2

        if(user < com){
            user = user + 3;
        }//end if
        int result = user - com;

        System.out.println("USER: " + user);
        System.out.println("COM: " + com);

        switch(result){ //나오는 값은 0,1,2
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("졌다");
                break;
        }//end switch
    }
}

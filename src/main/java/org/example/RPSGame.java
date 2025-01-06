package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위0, 바위1, 보2 입력하세요");
        // 코드를 실행하면 아래 라인에서 입력을 받기위해 대기합니다.
        // 따라서 아래 실행 터미널에 키보드 입력을 하지 않으면 대기 중인 상태가 됩니다.
        String str = scanner.nextLine(); //키보드에서 입력한 문자열
        System.out.println(str);

        int user = Integer.parseInt(str); //사용자값
        int com = (int) (Math.random() * 3); //컴값

        if(user < com){
            user = user + 3;
        }//end if
        int result = user - com;

        System.out.println("USER: " + user);
        System.out.println("COM: " + com);

        switch(result){ //나오는 값 0,1,2
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

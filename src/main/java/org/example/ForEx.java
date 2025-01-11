package org.example;

public class ForEx {

    public static void main(String[] args) {
        //(순서1) int i = 0: 초기문, 한번만 동작
        //(순서2) i < 10: 조건식 (값, 결과를 만들어냄), 부등호 연산은 true or false
        //(순서3) {  } 부분 실행, 처리
        //(순서4) i++: 변환식 (값, 결과를 만들어냄)
        //(순서5) i < 10
        for (int i = 0; i < 10; i++) {

            if (i == 5){
                continue; //"위"로 (반복)
            }

//            if (i == 5){
//                break; // "아래"로 (제어)
//            }
            System.out.println(i);

        }//end for
    }

}

package org.example;

public class IfTest{

    public static void main(String[] args) {

        //랜덤 int 값 0.0 - 0.9999 * 3 = 2.9999 (int)(Math.random()*6)
        int value = (int) (Math.random() * 6) + 1; //0-6사이의 숫자가 나옴
        System.out.println(value);

        int oddEven = value % 2; //2로 나는 나머지 0,1

        //만일 oddEven값이 0이면 짝수 출력 ==> boolean (참/거짓)
//        if(oddEven == 0){
//            System.out.println("짝수");
//        }else {
//            System.out.println("홀수");
//        }

        //if ~ return
//        if (oddEven == 0){
//            System.out.println("짝수");
//            return;
//        }
//        System.out.println("홀수");

        //삼항 연산자: 조건식(결과)? 참인 경우 결과: 거짓인 경우, if ~else 대신 처리하기 좋음
        String result = oddEven == 1? "홀수":"짝수";
        System.out.println(result);

        }

}

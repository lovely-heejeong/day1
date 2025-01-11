package org.example;

public class StrEx {

    public static void main(String[] args) {

        String str1 = "AAA";
//        String str2 = new String("AAA"); //이렇게 만들어도 되지만 보통은 위의 방식으로, 메모리 낭비가 심함

        //문자열 비교시 .equals 사용
        System.out.println(str1.equals("aaa"));

    }
}

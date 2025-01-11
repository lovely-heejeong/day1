package org.example;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //오직 br.readLine()만 사용
        //문자열로 받고 싶을 때 but throws Exception 써야 사용 가능
        String str = br.readLine();

        //문자열을 double로 변환
        double value1 = Double.parseDouble(str);

        //문자열을 정수로 변환
        int value2 = Integer.parseInt(str);


    }
}
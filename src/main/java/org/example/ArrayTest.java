package org.example;

public class ArrayTest {
    public static void main(String[] args) {
        String[] strArr = {"빨", "주", "노", "초", "파", "남", "보"};

        for(int i = 0; i < strArr.length; i++) {
            System.out.println(i + 1 + "번째 값은 " + strArr[i]);
        }

        for(String color : strArr) {
            System.out.println(color);
        }
    }
}

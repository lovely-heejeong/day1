package org.example;

public class SwitchEx {

    public static void main(String[] args) {

        int value = (int)(Math.random() * 4); //나오는 값은 0,1,2,3

        switch (value){ //값이 정해져 있으므로 switch 사용
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }//end switch

    }
}

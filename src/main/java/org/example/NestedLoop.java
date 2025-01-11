package org.example;

public class NestedLoop {

    public static void main(String[] args) {

        //다중루프, 중첩문
        outer:
        for (int i = 0; i < 10 ; i++) { //바깥쪽은 고정, i = 0부터 시작

            System.out.println("i:  " + i);

            inner:
            for (int j = 0; j < 10 ; j++) {
                System.out.println("i : j  " + i +" : "+ j);

                if(j == 5){
                    break outer;
                }
            }

        }//end for

    }
}

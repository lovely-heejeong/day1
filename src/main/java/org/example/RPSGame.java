package org.example;

public class RPSGame {
    public static void main(String[] args) {

        int user = 2;
        int com = 0;
        if(user < com ){
            user = user + 3;
        }
        int result = user - com;

        switch(result){
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("졌다");
                break;
        }
    }
}

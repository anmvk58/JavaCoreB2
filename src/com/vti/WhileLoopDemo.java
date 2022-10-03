package com.vti;

import java.util.Random;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 100;
        boolean isTroiMua = true;

        while (isTroiMua){
            System.out.print("Ngồi ở nhà chơi game !!!   ");

            int x = random.nextInt();
            System.out.println("x = " + x);
            if(x%2 == 0){
                isTroiMua = false;
            }
        }

//        while (i < 10){
//            System.out.println("I Love You");
//            i = i + 1;
//        }
//
//        do {
//            System.out.println("I Love You");
//            i = i + 1;
//        } while (i < 10);
    }
}

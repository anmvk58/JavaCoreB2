package com.vti;

public class OperatorPlusEqual {
    public static void main(String[] args) {
        int x = 5;

        x += 10;
        // x = x + 10;

        x -= 5;
        // x = x - 5;

        x *= 5;
        // x = x*5;
        if(x > 5 && x < 10) {
            System.out.println("x lớn hơn 5 và nhỏ hơn 10");
        }

        if(x > 5 || x < -10) {
            System.out.println("X vô hại");
        }

        if(x < 5 ^ x > 10){
            System.out.println("X là phép XOR");
        }

        if(!(x < 5)){
            System.out.println("X lớn hơn hoặc bằng 5");
        }

        System.out.println(x);
    }
}

package com.vti;

import java.util.Random;

public class BreakDemo {
    public static void main(String[] args) {
        Random random = new Random();
        // break key word
        for(int i = 0; i< 3; i ++){
            int tuoi = 0;
            System.out.println("=================== " + i + "===================");
            for(; tuoi < 15; tuoi++){
                if(tuoi <= 10){
                    System.out.print("Tuổi = " + tuoi + ", nên được nhận lì xì ");
                } else {
                }
                int tienLiXi = random.nextInt(100);
                System.out.println("giá trị " + tienLiXi);
            }
        }

    }
}

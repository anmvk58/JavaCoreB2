package com.vti;

import java.time.LocalDate;
import java.util.Random;

public class RandomDemo {
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        //Random 1 số từ 10 -> 20
//        int x = random.nextInt(10) + 10; // 0 -> 10
//
//        System.out.println("Số ngẫu nhiên x = " + x);
//    }

    public static void main(String[] args) {
        Random random = new Random();

        int minDay = (int) LocalDate.of(2022,10,1).toEpochDay();
        int maxDay = (int) LocalDate.of(2022,10,31).toEpochDay();

        long randomIntDay = random.nextInt(maxDay - minDay + 1) + minDay;

        LocalDate randomDay = LocalDate.ofEpochDay(randomIntDay);
        System.out.println(randomDay);
    }
}

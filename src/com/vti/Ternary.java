package com.vti;

public class Ternary {
    public static void main(String[] args) {
        int x = 9;

        //Cách 1: Cú pháp Ternary
        String type = (x%2 == 0) ? "Chẵn" : "Lẻ";
        System.out.println("Số x là số " + type);

        //Cách 2: Sử dụng if else:
        if (x%2 == 0){
            System.out.println("Số x là số chẵn ");
        } else {
            System.out.println("Số x là số lẻ ");
        }

    }
}

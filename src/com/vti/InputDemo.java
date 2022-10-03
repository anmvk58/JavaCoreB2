package com.vti;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn bao nhiêu tuổi ?");
        int x = scanner.nextInt();
        System.out.println("Bạn sinh năm " + (2022 - x) + " phải không ?");

        scanner.nextLine();
        System.out.println("Bạn tên là gì ?");
        String myName = scanner.nextLine();
        System.out.println("Xin chào, " + myName);

        System.out.println("Bài kiểm tra được bao nhiêu điểm ?");
        float mark = scanner.nextFloat();
        System.out.println("Bài thi được " + mark + " điểm");

    }
}

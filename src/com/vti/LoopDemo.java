package com.vti;

public class LoopDemo {
    public static void main(String[] args) {
        // vòng lặp for normal
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }

        // vòng lặp for each
        int[] listNumbers = {10, 20, 30, 40, 50};
        for(int temp : listNumbers){
            System.out.println(temp);
        }

        // sử dụng vòng lặp đẻ in tất cả các số chia hết cho 3, nhỏ hơn 50 và lớn hơn 0.
        // Cách 1
        for(int i = 3; i <50; i = i + 3){
                System.out.print(i + ", ");
        }

        // Cách 2
        for(int i = 1; i <50; i++){
            if(i%3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

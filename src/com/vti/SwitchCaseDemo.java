package com.vti;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Ví dụ 1
        int x = 10;

        switch (x){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            default:
                System.out.println("Vui lòng nhập số từ 1 -> 5");
                break;
        }

        // Ví dụ 2
        String thoiTiet = "vòi rồng";

        switch (thoiTiet){
            case "mưa":
                System.out.println("Đi làm bằng taxi");
                break;
            case "nắng":
                System.out.println("Đi làm bằng xe máy");
                break;
            case "âm u":
                System.out.println("Đi làm bằng tàu điện");
                break;
            default:
                System.out.println("Đi bằng chân");
                break;
        }
    }
}

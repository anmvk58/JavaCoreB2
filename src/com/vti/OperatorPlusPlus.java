package com.vti;

public class OperatorPlusPlus {
    public static void main(String[] args) {
        int x = 5;
        // x++ thì kết thúc dòng lệnh số 7, x mới tăng lên 1 đơn vị
        int y = x++;

        // ++x thì bắt đầu vào dòng lệnh số 10 thì x tăng lên 1 đơn vị
//        int y = ++x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

//Operator ++ => luôn khiến biến số tăng 1 đơn vị (1)
// nếu ++ đứng trước (++x) => thì biến được tăng luôn 1 đơn vị trước khi dòng lệnh đó được chạy.
// nếu ++ đứng sau (x++) => thì biến được tăng 1 đơn vị sau khi dòng lệnh đó kết thúc.
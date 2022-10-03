package com.vti;

public class IfElseDemo {

    public static void main(String[] args) {
	    String thoiTiet = "ẩm ướt";

	    //Loại 1
	    if(thoiTiet == "nắng"){
	        // Nếu mệnh đề đúng thì thực hiện lệnh ở đây
            System.out.println("Đi làm bằng taxi");
        } else {
	        // Nếu mệnh đề không đúng thì sẽ thực hiện lệnh ở đây
            System.out.println("Đi làm bằng xe máy");
        }

	    //Loại 2
        String thoiTiet2 = "nắng";
        if(thoiTiet2 == "mưa"){
            System.out.println("Đi làm bằng taxi");
        } else if (thoiTiet2 == "bão") {
            System.out.println("Ở nhà nghỉ phép !!!");
        } else if (thoiTiet2 == "ẩm ướt"){
            System.out.println("Gọi bạn qua đón !!!");
        } else {
            System.out.println("Đi làm bằng xe máy");
        }
    }
}

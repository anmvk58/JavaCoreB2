package com.vti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
//    public static void main(String[] args) {
//        Locale locale = new Locale("ja", "JP");
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//        String date = dateFormat.format(new Date());
//
//        System.out.println(date);
//    }

    public static void main(String[] args) {
        String pattern = "dd-MMMMM-yy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateFormated = simpleDateFormat.format(new Date());

        System.out.println(dateFormated);
    }
}

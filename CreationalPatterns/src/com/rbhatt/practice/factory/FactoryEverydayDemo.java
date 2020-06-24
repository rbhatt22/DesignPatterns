package com.rbhatt.practice.factory;

import java.util.Calendar;
import java.util.TimeZone;

//Factory method demo using Calendar
public class FactoryEverydayDemo {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("IST"));

        System.out.println(cal);
        System.out.println(cal1);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal1.get(Calendar.DAY_OF_MONTH));

        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal1.get(Calendar.HOUR_OF_DAY));

    }



}

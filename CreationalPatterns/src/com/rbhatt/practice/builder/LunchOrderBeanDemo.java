package com.rbhatt.practice.builder;

//Demo for LunchOrderBean
public class LunchOrderBeanDemo {

    public static void main(String[] args) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        /***
        with no-arg constructor and setter methods, problem is that it makes the class mutable.
        Another problem is that there is no particular contract of instance creation.
        So I can create instance and not set some of the fields.
        For example for the instance that is created here doesn't have bread filed set.
        ***/

        //lunchOrderBean.setBread("wheat");
        lunchOrderBean.setGreens("lettuce");
        lunchOrderBean.setDressing("ranch");
        lunchOrderBean.setMeat("chicken");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getGreens());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

    }

}

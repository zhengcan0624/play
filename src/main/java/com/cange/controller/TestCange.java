package com.cange.controller;

import org.springframework.util.Assert;

public class TestCange {
    public static void main(String[] args) {
        System.out.println("cange weiwu");

        String name = null;

        panduan(name);




    }

    public static void panduan(String name){
        Assert.notNull(name,"名字不能为空!");
        System.out.println(name);

    }

}

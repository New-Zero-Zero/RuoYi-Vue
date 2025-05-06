package com.ruoyi.web.controller.test;


import com.ruoyi.test.TestService;

public class CeShiTest {
    public static void main(String[] args) {
        TestService testService =  new TestService();
        System.out.println(testService.helloTest());
    }
}
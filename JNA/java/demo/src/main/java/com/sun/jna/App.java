package com.sun.jna;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int result = CLibrary.INSTANTCE.sayHello(2, 3);
        System.out.println("sayHello的返回结果:" + result);
    }
}

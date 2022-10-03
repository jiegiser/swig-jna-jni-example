/*
 * @Descripttion: 
 * @Author: jiegiser
 * @Date: 2022-10-03 16:07:22
 * @LastEditors: jiegiser
 * @LastEditTime: 2022-10-03 16:25:42
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.load("E:/code/SWIG/Java/example.so");
        System.out.println(example.getMy_variable());
        System.out.println(example.fact(5));
        System.out.println(example.get_time());
    }
}

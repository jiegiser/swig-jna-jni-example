/*
 * @Descripttion: 
 * @Author: jiegiser
 * @Date: 2022-10-03 16:13:20
 * @LastEditors: jiegiser
 * @LastEditTime: 2022-10-03 16:27:45
 */

class demo {
  static {
    // 加载绝对路径中的文件
    System.out.println("Hello, World!");
    System.load("E:/code/SWIG/Java/example.so");
    // 加载系统库的默认路径
    // System.loadLibrary("test");
  }

  public static void main(String argv[]) {
    System.out.println(example.getMy_variable());
    System.out.println(example.fact(5));
    System.out.println(example.get_time());
  }
}
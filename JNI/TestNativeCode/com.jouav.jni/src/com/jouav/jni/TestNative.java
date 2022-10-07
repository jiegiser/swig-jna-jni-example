package com.jouav.jni;

public class TestNative {
  public native void sayHello();

  public int number = 10; // 定义变量初始值为 10，在 C++中进行修改
  static {
    System.load("F:/github/swig-jna-jni-example/JNI/C++/Dll1/x64/Debug/Dll1.dll");
  }

  public static void main(String[] args) {
    System.loadLibrary("NativeCode"); // 加载动态链接库
    TestNative test = new TestNative(); // 创建本类实例
    test.sayHello();
    System.out.println("C++中操作之后的结果：" + test.number);
  }

}

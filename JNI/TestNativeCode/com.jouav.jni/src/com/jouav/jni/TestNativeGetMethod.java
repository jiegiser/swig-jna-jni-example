package com.jouav.jni;

public class TestNativeGetMethod {
  public native void sayHello(); // C++ 本地代码实现

  public static void main(String[] args) {
    System.loadLibrary("NativeCode"); // 加载动态链接库
    TestNative test = new TestNative();
    test.sayHello();
  }

  double max(double num1, double num2) {
    return num1 > num2 ? num1 : num2;
  }
}

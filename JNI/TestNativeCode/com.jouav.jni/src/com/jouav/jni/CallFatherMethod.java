package com.jouav.jni;

public class CallFatherMethod {
  public native void sayHello(); // C++本地代码实现

  public Father p = new Child(); // 创建 Child 的实例对象

  public static void main(String[] args) {
    System.loadLibrary("NativeCode");// 加载动态链接库
    CallFatherMethod test = new CallFatherMethod();
    test.sayHello();
  }
}

class Father {
  public void function() {
    System.out.println("Father function");
  }
}

class Child extends Father {
  public void function() {
    System.out.println("Child function");
  }
}

package com.sun.jna;

public interface CLibrary extends Library {
  // 加载 dll 链接库
  CLibrary INSTANTCE = (CLibrary) Native
      .loadLibrary("F:/github/swig-jna-jni-example/JNA/C++/Dll1/x64/Debug/TestJNA.dll", CLibrary.class);

  // 此方法为链接库中的方法
  int sayHello(int a, int b);
}

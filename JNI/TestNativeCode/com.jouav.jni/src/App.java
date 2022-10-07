import com.jouav.jni.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TestNative test_native = new TestNative();
        test_native.sayHello();
    }
}

package dky.hellojni;

/**
 * Created by Administrator on 2016/7/21.
 */
public class JNITest {
    static {
        System.loadLibrary("mymodule");
    }

    public static native String getSring();
    public static native int MyAdd(int n1, int n2);
}

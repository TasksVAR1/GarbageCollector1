import java.util.*;

public class Main {

    public static void main (String[] args){

        method();
    }

    public static void method() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        for (int i = 0; i < 1000000; i++) {
            Date date = new Date();

        }
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        System.gc();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
    }
}

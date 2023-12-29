package test;

import java.lang.reflect.*;

public class MyUnitTestFramework {

    public static void runTests(Class<?> testClass) {
        Method[] methods = testClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("check")) {
                try {
                    method.invoke(null);
                    System.out.println("Test " + method.getName() + " passed.");
                } catch (Exception e) {
                    System.out.println("Test " + method.getName() + " failed.");
                    e.printStackTrace();
                }
            }
        }
    }

    public static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
    }

    // Add more assertion methods as needed...
}

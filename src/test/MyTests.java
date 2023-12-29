package test;

public class MyTests {

    public static void checkAddition() {
        int result = 2 + 2;
        MyUnitTestFramework.assertEquals(4, result);
    }

    public static void main(String[] args) {
        MyUnitTestFramework.runTests(MyTests.class);
    }
}

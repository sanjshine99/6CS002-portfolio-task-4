import java.lang.reflect.*;

public class MethodWithParameterReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Method methodWithParams = d.getDeclaredMethod("setA", double.class);
            System.out.println(
                    "Specific Declared Method with Parameters of DoubleClass: " + methodWithParams.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

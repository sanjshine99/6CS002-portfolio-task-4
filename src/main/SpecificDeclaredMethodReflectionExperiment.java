import java.lang.reflect.*;

public class SpecificDeclaredMethodReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Method method = d.getDeclaredMethod("getB");
            System.out.println("Specific Declared Method: " + method.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

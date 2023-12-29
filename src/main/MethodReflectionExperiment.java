import java.lang.reflect.*;

public class MethodReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Method[] methods = d.getDeclaredMethods();
            System.out.println("Declared Methods of DoubleClass: ");
            for (Method method : methods) {
                System.out.println(method.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

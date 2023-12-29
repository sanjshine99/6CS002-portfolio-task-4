import java.lang.reflect.*;

public class ConstructorReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Constructor<?>[] constructors = d.getDeclaredConstructors();
            System.out.println("Declared Constructors of DoubleClass: ");
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

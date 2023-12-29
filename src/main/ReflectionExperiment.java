import java.lang.reflect.*;

public class ReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> c = DoubleClass.class;
            System.out.println("Class Name is " + c.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

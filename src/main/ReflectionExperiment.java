import java.lang.reflect.*;

public class ReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> c = DoubleClass.class;
            System.out.println("Class Name is " + c.getName());

            Class<?> c2 = Class.forName("DoubleClass");
            System.out.println("Class Loaded with forName " + c2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
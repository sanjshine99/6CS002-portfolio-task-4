import java.lang.reflect.*;

public class DeclaredFieldReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Field[] fields2 = d.getDeclaredFields();
            System.out.println("Declared Fields of DoubleClass: ");
            for (Field field : fields2) {
                System.out.println(field.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

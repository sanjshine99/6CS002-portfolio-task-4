import java.lang.reflect.*;

public class AccessPrivateFieldReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            Field privateField = d.getDeclaredField("b");
            privateField.setAccessible(true);
            DoubleClass DoubleClass = new DoubleClass();
            double fieldValue = (double) privateField.get(DoubleClass);
            System.out.println("Access Private Field of DoubleClass: " + fieldValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.lang.reflect.*;

public class ReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;
            Field[] fields = d.getDeclaredFields();

            System.out.println("Class Name is " + d.getName());

            Class<?> d2 = Class.forName("DoubleClass");
            System.out.println("Class Loaded with forName " + d2.getName());

            System.out.println("Is a Interface: " + d.isInterface());

            System.out.println("Is a Array: " + d.isArray());

            System.out.println("Is a Primitive: " + d.isPrimitive());

            for (Field field : fields) {
                if (field.getType().isPrimitive()) {
                    System.out.println("Field " + field.getName() + " is of primitive type: " + field.getType());
                } else {
                    System.out.println("Field " + field.getName() + " is not of primitive type: " + field.getType());
                }
            }

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

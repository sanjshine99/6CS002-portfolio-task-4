import java.lang.reflect.*;

public class PrimitiveTypeReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;
            Field[] fields = d.getDeclaredFields();

            System.out.println("Is a Primitive: " + d.isPrimitive());

            for (Field field : fields) {
                if (field.getType().isPrimitive()) {
                    System.out.println("Field " + field.getName() + " is of primitive type: " + field.getType());
                } else {
                    System.out.println("Field " + field.getName() + " is not of primitive type: " + field.getType());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

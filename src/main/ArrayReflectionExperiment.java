public class ArrayReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            System.out.println("Is a Array: " + d.isArray());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

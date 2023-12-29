public class ClassNameReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            System.out.println("Class Name is " + d.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

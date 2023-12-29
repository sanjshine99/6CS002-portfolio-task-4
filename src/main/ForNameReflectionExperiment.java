public class ForNameReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d2 = Class.forName("DoubleClass");
            System.out.println("Class Loaded with forName " + d2.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

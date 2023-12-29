public class InterfaceReflectionExperiment {

    public static void main(String[] args) {
        try {
            Class<?> d = DoubleClass.class;

            System.out.println("Is a Interface: " + d.isInterface());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

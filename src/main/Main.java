public class Main {
    public static void main(String[] args) {
        DoubleClass obj = new DoubleClass(5.55, 28.2);

        System.out.println(obj);
        obj.squareA();
        System.out.println("Updated A: " + obj.getA());
        obj.setB(15.0);
        System.out.println("Updated B: " + obj.getB());
    }
}

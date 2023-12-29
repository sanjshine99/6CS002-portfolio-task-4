public class DoubleClass {

    public double a = 15.6;
    private double b = 35.8;

    public DoubleClass() {
    }

    public DoubleClass(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void squareA() {
        this.a *= this.a;
    }

    private void squareB() {
        this.b *= this.b;
    }

    public double getA() {
        return a;
    }

    private void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String toString() {
        return String.format("(a:%.2f, b:%.2f)", a, b);
    }
}

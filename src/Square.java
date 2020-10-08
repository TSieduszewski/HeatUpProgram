public class Square extends Shape  {
    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateCircuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getH() {
        return 0;
    }

    @Override
    public void setH(double h) {

    }


}

public class Circle extends Shape {


    public Circle(double r) {
        super(r);
    }

    @Override
    public double calculateArea() {
        return Math.PI*a*a;
    }

    @Override
    public double calculateCircuit() {
        return 2*Math.PI*a;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
this.a=a;
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

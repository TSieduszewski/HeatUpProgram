public class Triangle extends Shape {

    double c;

    public Triangle(double a, double b, double h, double c) {
        super(a, b, h);
        this.c=c;
        test = () -> a + b > c && b + c > a && c + a > b;
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
        return h;
    }

    @Override
    public void setH(double h) {
    this.h = h;
    }

    public double getC() {
        return h;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return (a*h)/2;
    }

    @Override
    public double calculateCircuit() {
        return a+b+c;
    }
public TriangleTest triangleTest(){
        return test;
}

}

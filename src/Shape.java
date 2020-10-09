public abstract class Shape implements Area, Circuit {

    double a;
    double b;
    double h;
    TriangleTest test;

    public Shape(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Shape(double r){
        a = r;
    }
    public abstract double getA();

    public abstract void setA(double a);

    public abstract double getB();

    public abstract void setB(double b);

    public abstract double getH();

    public abstract void setH(double h);
}

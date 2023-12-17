package shapes;

public class Triangle implements Shape{

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s =  (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

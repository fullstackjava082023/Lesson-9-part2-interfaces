package shapes;

public class Square implements Shape{

    double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size*size;
    }

    @Override
    public double getPerimeter() {
        return size*4;
    }
}

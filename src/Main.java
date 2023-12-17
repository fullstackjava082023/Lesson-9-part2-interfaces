import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;
import zoo.Animal;
import zoo.Cat;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Arja");
//        Animal animal1 = new Animal("Arja");
//        Animal animal2 = animal;
//        Animal animal3 = new Animal("ned");
//        System.out.println(animal.name);
////        Main m = new Main
//
//        Rectangle d = new MyRectangle(20, 20);
//        System.out.println(d.calculateArea());

//        System.out.println(animal.equals(animal2));
//
//        System.out.println(animal.getClass());
        Dog dog = new Dog("puppy");
        System.out.println(dog.getClass());

        System.out.println(dog.toString());

        Animal puppy1 = new Dog("puppy1");
        Animal putty = new Cat("putty");
        puppy1.saySomething();
        putty.sleep();

        Shape square = new Square(5);
        System.out.println(square.getArea());
        Shape circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(Math.sqrt(64));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5,8,10);
        shapes[1] = new Triangle(10,10,10);
        shapes[2] = new Circle(4);
        for (Shape shape : shapes) {
            System.out.println(shape.getClass() + " area: " + shape.getArea() + " perimeter: " + shape.getPerimeter());

        }




    }
}
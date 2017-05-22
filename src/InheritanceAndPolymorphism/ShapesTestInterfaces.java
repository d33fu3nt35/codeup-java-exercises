package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class ShapesTestInterfaces {
    public static void main(String[] args) {

        System.out.println("-- Rectangle --");
        Measurable myShape = new Rectangle(5.0, 5.0);
        System.out.println("Area: " + myShape.getArea() + "\n" + "Perimeter: " + myShape.getPerimeter());



        System.out.println("-- Square --");
        Measurable otherShape= new Square(10.0, 10.0);
        System.out.println("Area: " + otherShape.getArea() + "\n" + "Perimeter: " + otherShape.getPerimeter());


    }
}

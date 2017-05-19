package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class ShapesTestInterfaces {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5.0, 5.0);
        System.out.println(myShape.getArea() + " " + myShape.getPerimeter());

        Measurable otherShape= new Square(10.0, 10.0);
        System.out.println(otherShape.getArea() + " " + otherShape.getPerimeter());


    }
}

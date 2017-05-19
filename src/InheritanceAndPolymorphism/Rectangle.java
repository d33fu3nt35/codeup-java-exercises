package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class Rectangle extends Quadralateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter() {
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
}

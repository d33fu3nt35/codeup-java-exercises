package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
public class Square extends Quadralateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    void setLength(double length) {
        this.length = length;
        width = length;

    }

    @Override
    void setWidth(double width) {

    }

//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
}

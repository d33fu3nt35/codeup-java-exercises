package InheritanceAndPolymorphism;

/**
 * Created by daniel on 5/19/17.
 */
abstract class Quadralateral extends Shape implements Measurable {

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double length;
    protected double width;

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);

}

package ObjectOrientedProgramming;

/**
 * Created by daniel on 5/17/17.
 */
public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
    return Math.PI * (this.radius * this.radius);

    }


    public double getCirumference(){
        return 2 * Math.PI * this.radius;
    }
}

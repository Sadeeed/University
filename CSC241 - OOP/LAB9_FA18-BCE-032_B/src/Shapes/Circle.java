package Shapes;

public class Circle extends Shape{

    double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius){
        super();
        setRadius(radius);
    }

    public Circle(double radius,String colr, boolean fill){
        super(colr,fill);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimiter() {
        System.out.println("Circumference: " + (2 * Math.PI * getRadius()));
    }

    @Override
    public void computeArea() {
        System.out.println("Area: " + Math.PI * Math.pow(getRadius(),2));
    }

    @Override
    public void reset() {
    }
}

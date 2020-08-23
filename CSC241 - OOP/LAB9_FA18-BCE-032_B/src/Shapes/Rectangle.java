package Shapes;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        setWidth(1.0);
        setLength(1.0);
    }

    public Rectangle(double w, double l){
        super();
        setWidth(w);
        setLength(l);
    }

    public Rectangle(String colr, boolean fill, double w, double l){
        super(colr,fill);
        setWidth(w);
        setLength(l);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void getPerimiter() {
        System.out.println("Perimeter: " + ((2*getLength()) + (2*getWidth())));
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth() +  " and length= " + getLength() + ", which is a subclass of " + super.toString();
        //A Rectangle with width=<< xxx >> and length= << zzz >>, which is a subclass of << yyy >>
    }

    @Override
    public void computeArea() {
        System.out.println("Area: " + getLength()*getWidth() + " " + units);
    }

    @Override
    public void reset() {
        setLength(0);
        setWidth(0);
        //System.out.println("Reset rectangle! \n");
    }
}

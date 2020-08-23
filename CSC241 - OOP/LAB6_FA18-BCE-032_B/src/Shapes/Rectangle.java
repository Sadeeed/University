package Shapes;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        super();
    }

    public Rectangle(double w, double l){
        super();
        width = w;
        length = l;
    }

    public Rectangle(String colr, boolean fill, double w, double l){
        super(colr,fill);
        width = w;
        length = l;
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
    public void getArea() {
        System.out.println("Area: " + length*width); ;
    }

    @Override
    public void getPerimiter() {
        System.out.println("Perimeter: " + ((2*length) + (2*width)));
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth() +  " and length= " + getLength() + ", which is a subclass of " + super.toString();
//        if (isFilled())
//        {
//            return "A Rectangle with width= " + width +  " and length= " + length + ", which is a subclass of " + super.toString();
//        }
//        else {
//            return "A Rectangle with width= " + width +  " and length= " + length + ", which is a subclass of " + "A Not filled Shape with " + color + " color";
//        }

        //A Rectangle with width=<< xxx >> and length= << zzz >>, which is a subclass of << yyy >>
    }
}

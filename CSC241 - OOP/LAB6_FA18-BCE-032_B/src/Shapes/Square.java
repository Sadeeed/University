package Shapes;

public class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(String colr, boolean fill, double side){
        super(colr,fill,side,side);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
            return "A Square with side= " + getSide() +", which is a subclass of " + super.toString();
//        else {
//            return "A Rectangle with width= " + width +  " and length= " + length + ", which is a subclass of " + "A Not filled Shape with " + color + " color";
//        }
        //A Square with side=xxx, which is a subclass of yyy
    }
}

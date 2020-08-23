package Shapes;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String colr, boolean fill){
        color = colr;
        filled = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {

        if (isFilled())
        {
            return "A filled Shape with " + getColor() + " color";
        }
        else {
            return "A Not filled Shape with " + getColor() + " color";
        }
       // " A << filled/Not filled >> Shape with << green >> color."
    }

    public void getArea(){}

    public void getPerimiter(){}
}

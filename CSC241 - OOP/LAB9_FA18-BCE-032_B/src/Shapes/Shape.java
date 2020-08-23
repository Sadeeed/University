package Shapes;

public abstract class Shape implements Stats{
    private String color = "red";
    private boolean filled = true;

    public Shape(){
        setColor(color);
        setFilled(filled);
    }

    public Shape(String colr, boolean fill){
        setColor(colr);
        setFilled(fill);
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

    public abstract void getPerimiter();
}

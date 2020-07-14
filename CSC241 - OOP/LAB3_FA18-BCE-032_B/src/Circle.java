public class Circle {
    private int radius;

    public Circle()
    {
        radius = 5;
    }

    public Circle(int r)
    {
        radius = r;
    }

    public double CalCircumfrence()
    {
        return 2*3.146*radius;
    }

}

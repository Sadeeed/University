public class Distance {
    private int feet;
    private int inches;

    public Distance()
    {
        feet = 2;
        inches = 24;
    }

    public Distance(int f,int i)
    {
        feet = f;
        inches = i;
    }

    public void Display()
    {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }
}

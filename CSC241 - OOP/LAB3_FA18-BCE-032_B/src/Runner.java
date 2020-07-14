public class Runner {
    public static void main (String[] args)
    {
        // Task 1

        Point p = new Point();
        p.move(2,3);
        p.display();
        Point p1 = new Point(2,4);
        p1.move(2,3);
        p1.display();

        // Task 2
        Circle c = new Circle();
        System.out.println("Circumfrence: " + c.CalCircumfrence());
        Circle c1 = new Circle(10);
        System.out.println("Circumfrence: " + c1.CalCircumfrence());

        // Task 3
        Distance d = new Distance();
        d.Display();
        Distance d1 = new Distance(1,12);
        d1.Display();

    }
}


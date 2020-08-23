package Shapes;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Shape t = new Shape();
//        System.out.println(t.toString());

        Shape[] rect = new Shape[3];
        Shape[] box = new Shape[3];

        //initialization

        rect[0] = new Rectangle();
        rect[1] = new Rectangle(12.5,8.3);
        rect[2] = new Rectangle("red",false,12.3,7.9);


        box[0] = new Square();
        box[1] = new Square(8.0);
        box[2] = new Square("pink",false,10.0);

        for (Shape rec:rect){
            System.out.println(rec.toString());
            rec.getArea();
            rec.getPerimiter();
            System.out.println("\n");
        }

        for (Shape bx:box){
            System.out.println(bx.toString());
            bx.getArea();
            bx.getPerimiter();
            System.out.println("\n");
        }

//        ((Square)box[0]).setSide(6);
//        ((Square)box[1]).setSide(12);
//        ((Square)box[2]).setSide(15);

        System.out.println("NEW: \n");

        for (Shape bx:box){
            for (int i=0; i < 3; i++)
            {
                ((Square)box[i]).setSide((i+1)*2);
            }
            System.out.println(bx.toString());
            bx.getArea();
            bx.getPerimiter();
            System.out.println("\n");
        }

    }
}

// Can not extend / inherit shape class if we make it final. Since final classes are final and cant be changed
// Making getArea() final in the Rectangle class doesn't have any effects because it isn't changed anywhere
// Can not extend / inherit shape class if we make it final. Since final classes are final and cant be changed
// We can not have abstract and final modifiers together so the compiler throws an error, because abstract can be changed while final cant.
// No we cant, abstract methods can only be defined in abstract classes
// No!, We can not have abstract and final modifiers together so the compiler throws an error, because abstract can be changed while final cant.

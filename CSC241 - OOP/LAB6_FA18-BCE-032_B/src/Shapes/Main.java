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
        box[2] = new Square("pink",false,8.0);

//        for (int r=0; r < 3; r++){
//            System.out.println(rect[r].toString());
//            rect[r].getArea();
//            rect[r].getPerimiter();
//            System.out.println("\n");
//        }
//
//        for (int s=0; s < 3; s++){
//            System.out.println(box[s].toString());
//            box[s].getArea();
//            box[s].getPerimiter();
//            System.out.println("\n");
//        }

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

//        rect[0] = new Rectangle();
//        System.out.println(rect[0].toString());
//
//        rect[1] = new Rectangle(12.5,8.3);
//        System.out.println(rect[1].toString());
//
//        rect[2] = new Rectangle("red",false,12.3,7.9);
//        System.out.println(rect[2].toString());
//
//        box[0] = new Square();
//        System.out.println(box[0].toString());
//
//        box[1] = new Square(8.0);
//        System.out.println(box[1].toString());
//
//        box[2] = new Square("pink",false,8.0);
//        System.out.println(box[2].toString());
    }
}

// Without the noArgument constructor in the Shape class, the rectangle class can not access the super() because it does not exist anymore
// Without the specific constructors their respective arguments in the main class lead to errors

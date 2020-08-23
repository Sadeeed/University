public class Point{

    private int x;
    private int y;

    public Point(){
        x = 1;
        y = 2;
    }

    public Point(int a, int b){
        x = a;
        y = b;
    }

    /*
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
     */


    public void move(int mx, int my){
        this.x += mx;
        this.y += my;
    }

    public void display() {
        System.out.println("X: " + x + " Y: " + y);
    }
}
package Car_Game;

public class Car_levelOne
{
    public String Player_name;
    public static int fuel;
    public static int right_val;
    public static int left_val;
    public static int jump_val;
    Car_levelOne(String name)
    {
        Player_name=name;
        fuel=5;
        right_val=0;
        left_val=0;
        jump_val=0;
    }
    public static void moveRight()
    {
        right_val++;
        fuel-=2;
        System.out.println("FUEL = "+fuel);
    }
    public static void moveleft()
    {
        left_val++;
        fuel-=3;
        System.out.println("FUEL = "+fuel);
    }
    public static void Jump()
    {
        jump_val++;
        fuel+=2;
        System.out.println("FUEL = "+fuel);
    }
    public void display()
    {
        System.out.println("FUEL = "+fuel);
        System.out.println("RIGHT MOVE = "+Car_levelOne.right_val);
        System.out.println("LEFT MOVE = "+Car_levelOne.left_val);
        System.out.println("JUMP = "+Car_levelOne.jump_val);
    }
}

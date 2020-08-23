package Q1;

public class CarGame_levelOne {
    public static int r,l,j;
    public String Player_name;
    public static int fuel;

    public CarGame_levelOne()
    {
        fuel = 5;
    }

    public static void moveRight()
    {
        if (fuel == 0)
        {
            System.out.println("Fuel Low");
        }
        else
        {
            fuel -= 2;
        }
        r++;
    }

    public static void moveLeft()
    {
        if (fuel == 0)
        {
            System.out.println("Fuel Low");
        }
        else
        {
            fuel -= 3;
        }
        l++;
    }

    public static void Jump()
    {
        fuel += 2;
        j++;
    }


}

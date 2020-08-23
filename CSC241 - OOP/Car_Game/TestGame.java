package Car_Game;
import java.util.Scanner;
public class TestGame
{
    public static void main(String[] args)
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NAME = ");
        name=input.next();
        Car_levelOne car1 = new Car_levelOne(name);
        while((Car_levelOne.fuel)<=20)
        {
            Car_levelOne.moveRight();
            Car_levelOne.Jump();
            Car_levelOne.Jump();
            Car_levelOne.Jump();
            Car_levelOne.Jump();
            Car_levelOne.moveleft();
            if((Car_levelOne.fuel)==0)
            {
                System.out.println("CAR HAS BEEN STOPPED MOVING");
                car1.display();
            }
        }
        Car_levelTwo.levelTwo(car1.Player_name);
    }
}

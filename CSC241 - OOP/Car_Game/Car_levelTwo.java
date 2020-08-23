package Car_Game;

public class Car_levelTwo
{
    public static void levelTwo(String name)
    {
        System.out.println("PLAYER NAME ="+name);
        System.out.println("YOU ARE AT LEVEL-2");
        System.out.println("CAR HAS MOVED "+Car_levelOne.right_val+"Times Right");
        System.out.println("CAR HAS MOVED "+Car_levelOne.left_val+"Times Left");
        System.out.println("CAR HAS MOVED "+Car_levelOne.jump_val+"Times Jump");
    }
}

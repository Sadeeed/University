package Q1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarGame_levelOne l1 = new CarGame_levelOne();
        l1.Player_name = "Sadeed";
        CarGame_levelOne.moveRight();
        CarGame_levelOne.moveLeft();
        for (int i=0 ; i <= 10 ; i++)
        {
            CarGame_levelOne.Jump();
        }
        if(CarGame_levelOne.fuel > 20)
        {
            CarGame_levelTwo.LevelTwo();
            System.out.println("\nRight: " + CarGame_levelOne.l + "\nLeft: " + CarGame_levelOne.r + "\nJump: " + CarGame_levelOne.j);
        }
    }
}

package Final;

import java.util.Scanner;

public class Lift {

    public int liftCharges = 1000;
    public boolean hasLift;

    public int getLift(){
        Scanner input = new Scanner(System.in);
        System.out.println("Does the apartment have a lift? (True / False)");

        //System.out.println(test);
        hasLift = input.nextBoolean();

        if (hasLift) return liftCharges;
        return 0;

    }

}

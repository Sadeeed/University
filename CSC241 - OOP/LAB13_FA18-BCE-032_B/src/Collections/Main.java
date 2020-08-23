package Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Task 1:
        System.out.println(ConsoleColors.CYAN + "Task 1" + ConsoleColors.RESET);
        Task1 t1 = new Task1();
        t1.sumAndAverage();


        // Task 2:
        System.out.println(ConsoleColors.CYAN + "\nTask 2" + ConsoleColors.RESET);
        StudentIO t2 = new StudentIO();
        t2.printQueue();


    }
}

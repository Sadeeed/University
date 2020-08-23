package Strings;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Task 1
        Task1 t1 = new Task1();
        System.out.println(ConsoleColors.CYAN + "Task 1\n" + ConsoleColors.RESET);
        t1.makeSentence(20);

        //Task 2
        Task2 t2 = new Task2();
        System.out.println(ConsoleColors.CYAN + "\nTask 2\n" + ConsoleColors.RESET);
        t2.tokenize("(555) 555-5555");

        //Task 3
        Task3 t3 = new Task3();
        System.out.println(ConsoleColors.CYAN + "\nTask 3\n" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "Sentence: " + ConsoleColors.RESET +"The light that burns twice as bright burns half as long.");
        t3.tokenize("The light that burns twice as bright burns half as long.");

    }
}

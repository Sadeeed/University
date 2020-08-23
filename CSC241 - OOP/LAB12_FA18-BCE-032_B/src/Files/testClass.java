package Files;

public class testClass {
    public static void main(String[] args) {

//        ArrayList<Employee> emp = new ArrayList<>();
//        emp.add(new Employee("Sadeed",32,99999));
//        emp.add(new Employee("Test",22,18798));
//        emp.add(new Employee("Test2",52,18798));


//        employeeIO eIO = new employeeIO();
//
//        eIO.addEmployee(ui.employeeInput());
//        eIO.searchEmployee(32,"Sadeed");

        // Task 1:
        System.out.println(ConsoleColors.CYAN + "Task 1\n" + ConsoleColors.RESET);
        Task1 t1 = new Task1();
        t1.write("The quick brown fox jumps over a lazy dog.");
        t1.read();
        System.out.println("\n");


        // Task 2:
        System.out.println(ConsoleColors.CYAN + "Task 2\n" + ConsoleColors.RESET);
        UserInput ui = new UserInput();
        ui.menu();

    }
}

package PayRollSystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        DateofBirth sed = new DateofBirth(12, "MAY");
        DateofBirth hed = new DateofBirth(12, "JUNE");
        DateofBirth ced = new DateofBirth(12, "JULY");
        DateofBirth bpced = new DateofBirth(12, "AUGUST");
        DateofBirth pwed = new DateofBirth(12, "SEPTEMBER");

        Scanner sc = new Scanner(System.in);
        LocalDate currentdate = LocalDate.now();

        emp[0] = new SalariedEmployee("Saira", "Khan", "111-111-1111", sed, 800);
        emp[1] = new HourlyEmployee("Muhammad", "Ali", "222-222-2222", hed, 16.75, 40);
        emp[2] = new CommissionEmployee("Abu", "Bakar", "333-333-3333", ced, 1000, 0.06);
        emp[3] = new BasePlusCommissionEmployee("Usman", "Ahmad", "444-444-4444", bpced, 1000, 0.06, 300);
        emp[4] = new PieceWorker("Sana", "Javed", "666-666-6666", pwed, 15.75, 8);

        for (Employee e : emp) {
            int currentDay = currentdate.getDayOfMonth();
            Month currentMonth = currentdate.getMonth();
            int currentYear = currentdate.getYear();

            System.out.println("Todays Date is: " + currentDay + "-" + currentMonth + "-" + currentYear);
            System.out.println(e);
            System.out.println("Earned:$" + e.earnings());

            String month = currentMonth.toString();

            // System.out.print("Enter salary month:");
            //int month=sc.nextInt;

            //System.out.println(month.equals(e.getBirthDate().getMonth()));

            if (e instanceof BasePlusCommissionEmployee || month.equals(e.getBirthDate().getMonth())) {
                System.out.println(ConsoleColors.GREEN + "Bonus:$" + 100 + ConsoleColors.RESET);
                System.out.println(ConsoleColors.GREEN + "Slary with bonus: $" + (e.earnings() + 100) + ConsoleColors.RESET);
            }
            System.out.println();

        }
    }
}
package demo;

public class AccountTest {
    public static void main(String[] args) {

        Account a1 = new Account(1111, "Sadeed", 10000);
        //System.out.println(a1.acc_no + " " + a1.getName() + " " + a1.amount);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}

package lab4;

public class Person {
    private String Name;
    private int Age;
    private String Address;

    public Person(String n, int a , String addr)
    {
        Name = n;
        Age = a;
        Address = addr;
    }
    public void display()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
    }

}

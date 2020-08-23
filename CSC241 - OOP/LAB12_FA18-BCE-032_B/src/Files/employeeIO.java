package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class employeeIO {

    public void addEmployee(ArrayList<Employee> empData) {
        try {
            FileOutputStream fOut = new FileOutputStream("employeeData.ser",true);
            ObjectOutputStream objOut = new ObjectOutputStream(fOut);

            objOut.writeObject(empData);
            objOut.close();
            fOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object readEmployee() {
        try {
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("employeeData.ser"));

            Object obj = objIn.readObject();
            objIn.close();
            return obj;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void searchEmployee(int empID,String empName) {

        ArrayList<Employee> obj = (ArrayList<Employee>) readEmployee();

//        System.out.println(obj);
        boolean isFalse = false;

        for (Employee e: Objects.requireNonNull(obj)){
            //System.out.println(e.getEmpID());
            if (empID == e.getEmpID() && (empName.equals(e.getName()) || empName.equals(e.getName().toLowerCase()))) {
                System.out.println("Record found! \n" + e);
                isFalse = true;
            }
        }
        if(!isFalse){
            System.out.println("Record not found! \n");
        }
    }


}
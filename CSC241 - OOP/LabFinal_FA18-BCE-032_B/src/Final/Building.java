package Final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Building {

    private String houseNum;
    public String residentName;
    private boolean isPaid;
    public int billingMonth;
    public String houseType;
    private double bill;


    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    public double calculateTotalBill(int allBuildings, int month){
        return 0.00;
    }

    public void saveInformation(String str){
        try{
            FileWriter textFile =  new FileWriter("residentialManagement.txt",false);
            textFile.write(str + "\n");
            textFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchInformation(int houseNumber){
        try{
            Scanner inFile = new Scanner(new File("residentialManagement.txt"));
            while(inFile.hasNextLine()){
                String text = inFile.nextLine();
                String s = text.replaceAll("[^0-9]", "");
                if(Integer.parseInt(s) == houseNumber){
                    System.out.println(text);
                }
            }
            //System.out.println(text);
        } catch (Exception ioException) {
            ioException.printStackTrace();
        }
    }

    public String input(String houseNum, String residentName, int paymentMonth, boolean paymentStatus, String houseType, double maintenanceBill){
        setHouseNum(houseNum);
        this.residentName = residentName;
        billingMonth = paymentMonth;
        setPaid(paymentStatus);
        this.houseType = houseType;
        setBill(maintenanceBill);

        return "House #" + getHouseNum() + "Resident Name: " + residentName + "Billing Month: "
                + paymentMonth + "Payment Status: " + isPaid() + "House Type: " + houseType;
    }

}

package Final;

import java.util.Scanner;

public class Apartment extends Building{

    private double apartmentMaintenanceBill = 2000;
    private final int noOfHouses = 30;

    public Lift lift;


    @Override
    public void setBill(double bill) {
        super.setBill(bill);
    }

    @Override
    public double getBill() {
        return super.getBill();
    }

    @Override
    public String input(String houseNum, String residentName, int paymentMonth, boolean paymentStatus, String houseType, double maintenanceBill) {
        return super.input(houseNum, residentName, paymentMonth, paymentStatus, houseType, maintenanceBill);
    }

    @Override
    public double calculateTotalBill(int allBuildings, int month) {
        return super.calculateTotalBill(allBuildings, month);
    }

    @Override
    public void saveInformation(String str) {
        super.saveInformation(str);
    }

    @Override
    public void searchInformation(int houseNumber) {
        super.searchInformation(houseNumber);
    }
}

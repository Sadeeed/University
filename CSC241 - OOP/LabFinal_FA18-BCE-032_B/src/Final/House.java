package Final;

public class House extends Building{

    private final double houseMainteneceBill = 1500;
    private final int noOfHouses = 10;

    @Override
    public String input(String houseNum, String residentName, int paymentMonth, boolean paymentStatus, String houseType, double houseMainteneceBill) {
        return super.input(houseNum, residentName, paymentMonth, paymentStatus, houseType, this.houseMainteneceBill);
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

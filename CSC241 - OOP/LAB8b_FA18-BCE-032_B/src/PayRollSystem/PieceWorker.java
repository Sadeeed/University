package PayRollSystem;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String first, String last, String ssn, DateofBirth pwed, double wage, int pieceProd) {
        super(first, last, ssn);
        setWage(wage);
        setPieces(pieceProd);
        setBirthDate(pwed);
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public DateofBirth getBirthDate() {
        return dob;
    }

    @Override
    public void setBirthDate(DateofBirth dob) {
        this.dob = dob;
    }

}

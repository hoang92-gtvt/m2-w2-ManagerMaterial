package material;

import java.time.LocalDate;

public class CrispyFlour extends Material{

    boolean quanlity;

    public CrispyFlour (String id, String name, LocalDate manafacturingDate, int cost, boolean quanlity) {
        super(id, name, manafacturingDate, cost);
        this.quanlity = quanlity;
    }

    public boolean isQuanlity() {
        return quanlity;
    }

    public void setQuanlity(boolean quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    public LocalDate getExpiryDate(){

    }
}

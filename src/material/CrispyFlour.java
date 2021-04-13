package material;

import manager.Discount;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {


    double quanlity;

    public CrispyFlour (String id, String name, LocalDate manafacturingDate, int cost, double quanlity) {
        super(id, name, manafacturingDate, cost);
        this.quanlity = quanlity;
    }

    public double getQuanlity() {
        return this.quanlity ;
    }

    public void setQuanlity(double quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public double getAmount() {
        return this.quanlity*this.getCost();
    }

    public LocalDate getExpiryDate(){
        LocalDate expiryDate= getManafacturingDate().plusYears(1);


        return expiryDate;
    }
    public double getRealMoney(){

        double realMoney= this.getAmount();
        LocalDate now= LocalDate.now();
        boolean isAfterDate = now.isAfter(getExpiryDate());
        boolean isBefor4month = now.isBefore(getExpiryDate().minusMonths(4));
        boolean isBefor2month = now.isBefore(getExpiryDate().minusMonths(2));
        if(isAfterDate){
            realMoney *=0;
        }
        else if (isBefor2month){
            realMoney *=DOUBLE_5;
        } else if(isBefor4month){
            realMoney *=DOUBLE_20;
        }else
            realMoney *=DOUBLE_40;

        return realMoney;


    }
}

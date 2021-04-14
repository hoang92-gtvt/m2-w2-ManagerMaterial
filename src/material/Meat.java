package material;

import manager.Discount;

import java.time.LocalDate;

public class Meat extends Material  {
    double weight;

    public Meat(String id, String name, LocalDate manafacturingDate, int cost, double weight) {
        super(id, name, manafacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost()*this.weight;
    }
    public LocalDate getExpiryDate(){
        LocalDate expiryDate= getManafacturingDate().plusDays(1);
        return expiryDate;
    }
    public double getRealMoney(){
        double realMoney= this.getAmount();

        LocalDate now= LocalDate.now();
        boolean isAfterDate = now.isAfter(getExpiryDate());
        boolean isBefor5Day = now.isBefore(getExpiryDate().minusDays(5));
        boolean isBefor3Day = now.isBefore(getExpiryDate().minusDays(3));
        if(isAfterDate){
            realMoney *=0;
        }
        else if (isBefor3Day){
            realMoney *=DOUBLE_50;
        } else if(isBefor5Day){
            realMoney *=DOUBLE_30;
        }else
            realMoney *=DOUBLE_10;

        return realMoney;
    }

}

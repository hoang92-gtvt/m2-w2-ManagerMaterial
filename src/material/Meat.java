package material;

import java.time.LocalDate;

public class Meat extends Material{
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
        return 0;
    }
    public LocalDate getExpiryDate(){

    }
}

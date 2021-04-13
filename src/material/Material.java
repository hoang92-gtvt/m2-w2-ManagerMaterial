package material;

import manager.Discount;

import java.time.LocalDate;

public abstract class Material implements Discount {
    private String id ;
    private String name;
    private LocalDate manafacturingDate;
    private int cost;

    public Material() {

    }

    public Material(String id, String name, LocalDate manafacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manafacturingDate = manafacturingDate;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManafacturingDate() {
        return manafacturingDate;
    }

    public void setManafacturingDate(LocalDate manafacturingDate) {

        this.manafacturingDate = manafacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
    public  abstract double getRealMoney();
}

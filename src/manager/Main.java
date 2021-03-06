package manager;


import material.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("C1","cripyFlour1", LocalDate.of(2020,8,14), 10000, 1 );
        materials[1] = new CrispyFlour("C2","cripyFlour2", LocalDate.of(2020,5,15), 15000, 1 );
        materials[2] = new CrispyFlour("C3","cripyFlour3", LocalDate.of(2020,6,15), 15000, 1 );
        materials[3] = new CrispyFlour("C4","cripyFlour4", LocalDate.of(2020,04,15), 15000, 1 );
        materials[4] = new CrispyFlour("C4","cripyFlour4", LocalDate.of(2020,04,15), 15000, 1 );

        materials[5] = new Meat("M1","Meet 1", LocalDate.of(2020,04,15), 80000, 1.5 );
        materials[6] = new Meat("M2","Meet 2", LocalDate.of(2020,04,15), 85000, 1.5 );
        materials[7] = new Meat("M3","Meet 3", LocalDate.of(2020,04,15), 83000, 1.5 );
        materials[8] = new Meat("M4","Meet 4", LocalDate.of(2020,04,15), 90000, 1.5 );
        materials[9] = new Meat("M5","Meet 5", LocalDate.of(2020,04,15), 108000, 1.5 );

        Material cr1 = materials[0];

        System.out.println(cr1.getAmount());
        System.out.println(cr1.getRealMoney());






//        LocalDate now= LocalDate.now();
//        boolean isBefor4month = now.isBefore(cr1.getExpiryDate().minusMonths(4));
//        boolean isBefor2month = now.isBefore(cr1.getExpiryDate().minusMonths(2));
//        System.out.println(isBefor2month);
//        System.out.println(isBefor4month);




    }
}

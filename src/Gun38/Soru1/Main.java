package Gun38.Soru1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> garrage = new ArrayList<>();

        Bus bus = new Bus(4, "Mercedes");
        TeslaCar tesla = new TeslaCar(2, "Tesla");
        ToyotaPrius toyota = new ToyotaPrius(3, "Toyota");

        garrage.add(bus);
        garrage.add(tesla);
        garrage.add(toyota);

        for (Vehicle vehicle : garrage) {
            System.out.println(vehicle.getClass().getSimpleName());
            System.out.println("-------------");
            System.out.println(vehicle.getEngine());
            System.out.println(vehicle.getModel());
            if (vehicle instanceof Bus){
                System.out.println("Otobusün özellikleri");
                System.out.println(((Bus) vehicle).changeDiesel());
                System.out.println();
            }
            if (vehicle instanceof TeslaCar){
                System.out.println("Teslanın özellikleri");
                System.out.println(((TeslaCar) vehicle).drive());
                System.out.println(((TeslaCar) vehicle).changeBattery());
                System.out.println();
            }
            if (vehicle instanceof ToyotaPrius){
                System.out.println("Toyotanın özellikleri");
                System.out.println(((ToyotaPrius) vehicle).drive());
                System.out.println(((ToyotaPrius) vehicle).changeBattery());
                System.out.println(((ToyotaPrius) vehicle).changeOil());
                System.out.println();
            }
        }
    }
}

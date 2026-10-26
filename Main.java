import java.util.ArrayList;

public class Main {

    // Works for ANY Vehicle: the correct displayInfo() is chosen at runtime
    static void inspect(Vehicle v) {
        v.displayInfo();
        System.out.println("      Age: " + v.calculateAge() + " yrs | Vintage: " + v.isVintage());
        System.out.println();
    }

    public static void main(String[] args) {

        
        System.out.println("---- Part A: One variable, many forms ----");
        Vehicle ride = new Car("Toyota", "Corolla", 2020, 4, "Gasoline");
        inspect(ride);

        ride = new Motorcycle("Yamaha", "Earox", 2026, 155, "Scooter");
        inspect(ride);

        ride = new Truck("Hino", "300", 2019, 4.5, 2);
        inspect(ride);

        
        System.out.println("---- Part B: The garage ----");
        ArrayList<Vehicle> garage = new ArrayList<>();
        garage.add(new Car("Toyota", "Corolla", 2020, 4, "Gasoline"));
        garage.add(new Car("BMW", "iX5", 2027, 5, "Gasoline"));
        garage.add(new Motorcycle("Yamaha", "Earox", 2020, 155, "Scooter"));
        garage.add(new Truck("Hino", "300", 2019, 4.5, 2));

        for (Vehicle v : garage) {
            inspect(v);
        }

    
        System.out.println("---- Part C: Year validation ----");
        Vehicle odd = new Motorcycle("Test", "Prototype", 1700, 125, "Underbone");
        inspect(odd);
    }
}

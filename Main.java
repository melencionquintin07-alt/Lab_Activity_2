public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Toyota";
        vehicle1.model = "Corolla";
        vehicle1.year = 2020;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Honda";
        vehicle2.model = "Civic";
        vehicle2.year = 1990;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Ford";
        vehicle3.model = "Mustang";
        vehicle3.year = 2015;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}
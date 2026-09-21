public class Vehicle {

    String brand;
    String model;
    int year;

    public void displayInfo() {
        System.out.println(brand + " " + model + " " + year);
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}
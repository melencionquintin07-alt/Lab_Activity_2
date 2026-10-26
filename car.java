public class Car extends Vehicle {
    private int seats;
    private String fuelType;

    public Car(String brand, String model, int year, int seats, String fuelType) {
        super(brand, model, year);
        this.seats = seats;
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo() {
        System.out.print("[CAR] ");
        super.displayInfo();
        System.out.println("      Seats: " + seats + " | Fuel: " + fuelType);
    }
}

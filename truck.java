public class Truck extends Vehicle {
    private double payloadTons;
    private int axles;

    public Truck(String brand, String model, int year, double payloadTons, int axles) {
        super(brand, model, year);
        this.payloadTons = payloadTons;
        this.axles = axles;
    }

    @Override
    public void displayInfo() {
        System.out.print("[TRUCK] ");
        super.displayInfo();
        System.out.println("      Payload: " + payloadTons + " tons | Axles: " + axles);
    }
}

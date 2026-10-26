public class Motorcycle extends Vehicle {
    private int engineCc;
    private String style;

    public Motorcycle(String brand, String model, int year, int engineCc, String style) {
        super(brand, model, year);
        this.engineCc = engineCc;
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.print("[MOTORCYCLE] ");
        super.displayInfo();
        System.out.println("      Engine: " + engineCc + "cc | Style: " + style);
    }
}

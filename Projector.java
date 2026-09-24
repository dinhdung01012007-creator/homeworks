package HomeWork.EquipmentManagement;

import java.util.Scanner;

public class Projector extends Equipment {

    private String resolution;
    private int brightness;

    public Projector() {
        super();
    }

    public Projector(String id, String equipmentName,
            double price, boolean isAvailable,
            String resolution, int brightness) {

        super(id, equipmentName, price, isAvailable);

        this.resolution = resolution;
        this.brightness = brightness;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void addEquipmentInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ADD PROJECTOR =====");

        System.out.print("Enter ID: ");
        id = scanner.nextLine();

        System.out.print("Enter equipment name: ");
        equipmentName = scanner.nextLine();

        System.out.print("Enter price: ");
        price = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter resolution: ");
        resolution = scanner.nextLine();

        System.out.print("Enter brightness (ANSI Lumens): ");
        brightness = scanner.nextInt();

        System.out.print("Is available? true/false: ");
        isAvailable = scanner.nextBoolean();
    }

    @Override
    public void updateEquipmentInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UPDATE PROJECTOR =====");

        System.out.print("Enter new name: ");
        equipmentName = scanner.nextLine();

        System.out.print("Enter new price: ");
        price = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter new resolution: ");
        resolution = scanner.nextLine();

        System.out.print("Enter new brightness: ");
        brightness = scanner.nextInt();

        System.out.print("Is available? true/false: ");
        isAvailable = scanner.nextBoolean();
    }

    @Override
    public double calculateRentalCost() {

        return price;
    }

    @Override
    public void displayInfo() {

        System.out.println("--------------------------------");
        System.out.println("Type: Projector");
        System.out.println("ID: " + id);
        System.out.println("Name: " + equipmentName);
        System.out.println("Price: " + price);
        System.out.println("Resolution: " + resolution);
        System.out.println("Brightness: " + brightness + " ANSI Lumens");
        System.out.println("Available: " + isAvailable);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("--------------------------------");
    }
}

package HomeWork.EquipmentManagement;

import java.util.Scanner;

public class Speaker extends Equipment {

    private int power;
    private String speakerType;

    public Speaker() {
        super();
    }

    public Speaker(String id, String equipmentName,
            double price, boolean isAvailable,
            int power, String speakerType) {

        super(id, equipmentName, price, isAvailable);

        this.power = power;
        this.speakerType = speakerType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    @Override
    public void addEquipmentInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ADD SPEAKER =====");

        System.out.print("Enter ID: ");
        id = scanner.nextLine();

        System.out.print("Enter equipment name: ");
        equipmentName = scanner.nextLine();

        System.out.print("Enter price: ");
        price = scanner.nextDouble();

        System.out.print("Enter power (W): ");
        power = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter speaker type: ");
        speakerType = scanner.nextLine();

        System.out.print("Is available? true/false: ");
        isAvailable = scanner.nextBoolean();
    }

    @Override
    public void updateEquipmentInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UPDATE SPEAKER =====");

        System.out.print("Enter new name: ");
        equipmentName = scanner.nextLine();

        System.out.print("Enter new price: ");
        price = scanner.nextDouble();

        System.out.print("Enter new power: ");
        power = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter new speaker type: ");
        speakerType = scanner.nextLine();

        System.out.print("Is available? true/false: ");
        isAvailable = scanner.nextBoolean();
    }

    @Override
    public double calculateRentalCost() {

        if (power >= 1000) {
            return price + 100000;
        }

        return price;
    }

    @Override
    public void displayInfo() {

        System.out.println("--------------------------------");
        System.out.println("Type: Speaker");
        System.out.println("ID: " + id);
        System.out.println("Name: " + equipmentName);
        System.out.println("Price: " + price);
        System.out.println("Power: " + power + " W");
        System.out.println("Speaker Type: " + speakerType);
        System.out.println("Available: " + isAvailable);
        System.out.println("Rental Cost: " + calculateRentalCost());
        System.out.println("--------------------------------");
    }
}

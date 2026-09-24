package HomeWork.EquipmentManagement;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EquipmentArrayList equipmentList
                = new EquipmentArrayList();

        int choice;

        do {

            System.out.println();
            System.out.println("==============================");
            System.out.println("    EVENT EQUIPMENT RENTAL");
            System.out.println("==============================");

            System.out.println("1. Add Projector");
            System.out.println("2. Add Speaker");
            System.out.println("3. Update Equipment");
            System.out.println("4. Delete Equipment");
            System.out.println("5. Find Equipment");
            System.out.println("6. Display All Equipments");
            System.out.println("7. Calculate Total Rental Cost");
            System.out.println("8. Count Equipment By Type");
            System.out.println("0. Exit");

            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    Projector projector
                            = new Projector();

                    projector.addEquipmentInfo();

                    equipmentList.addEquipment(
                            projector
                    );

                    break;

                case 2:

                    Speaker speaker
                            = new Speaker();

                    speaker.addEquipmentInfo();

                    equipmentList.addEquipment(
                            speaker
                    );

                    break;

                case 3:

                    System.out.print(
                            "Enter equipment ID: "
                    );

                    String updateId
                            = scanner.nextLine();

                    equipmentList.updateEquipment(
                            updateId
                    );

                    break;

                case 4:

                    System.out.print(
                            "Enter equipment ID: "
                    );

                    String deleteId
                            = scanner.nextLine();

                    equipmentList.deleteEquipmentById(
                            deleteId
                    );

                    break;

                case 5:

                    System.out.print(
                            "Enter equipment ID: "
                    );

                    String findId
                            = scanner.nextLine();

                    Equipment equipment
                            = equipmentList
                                    .findEquipmentById(findId);

                    if (equipment != null) {

                        equipment.displayInfo();

                    } else {

                        System.out.println(
                                "Equipment not found!"
                        );
                    }

                    break;

                case 6:

                    equipmentList
                            .displayAllEquipments();

                    break;

                case 7:

                    double total
                            = equipmentList
                                    .calculateTotalRentalCost();

                    System.out.println(
                            "Total Rental Cost: "
                            + total
                    );

                    break;

                case 8:

                    equipmentList
                            .countEquipmentByType();

                    break;

                case 0:

                    System.out.println(
                            "Program finished!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }

        } while (choice != 0);

        scanner.close();
    }
}

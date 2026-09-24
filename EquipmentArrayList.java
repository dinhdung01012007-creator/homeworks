package HomeWork.EquipmentManagement;

import java.util.ArrayList;

public class EquipmentArrayList {

    private ArrayList<Equipment> equipmentArrayList;

    public EquipmentArrayList() {

        equipmentArrayList = new ArrayList<>();
    }

    public void addEquipment(Equipment equipment) {

        if (equipment == null) {
            System.out.println("Equipment is null!");
            return;
        }

        if (findEquipmentById(equipment.getId()) != null) {
            System.out.println("ID already exists!");
            return;
        }

        equipmentArrayList.add(equipment);

        System.out.println("Add equipment successfully!");
    }

    public void updateEquipment(String id) {

        Equipment equipment
                = findEquipmentById(id);

        if (equipment == null) {

            System.out.println("Equipment not found!");
            return;
        }

        equipment.updateEquipmentInfo();

        System.out.println("Update successfully!");
    }

    public void deleteEquipmentById(String id) {

        Equipment equipment
                = findEquipmentById(id);

        if (equipment == null) {

            System.out.println("Equipment not found!");
            return;
        }

        equipmentArrayList.remove(equipment);

        System.out.println("Delete successfully!");
    }

    public Equipment findEquipmentById(String id) {

        for (Equipment equipment : equipmentArrayList) {

            if (equipment.getId().equalsIgnoreCase(id)) {
                return equipment;
            }
        }

        return null;
    }

    public void displayAllEquipments() {

        if (equipmentArrayList.isEmpty()) {

            System.out.println("Equipment list is empty!");
            return;
        }

        for (Equipment equipment : equipmentArrayList) {

            equipment.displayInfo();
        }
    }

    public double calculateTotalRentalCost() {

        double total = 0;

        for (Equipment equipment : equipmentArrayList) {

            total += equipment.calculateRentalCost();
        }

        return total;
    }

    public void countEquipmentByType() {

        int projectorCount = 0;
        int speakerCount = 0;

        for (Equipment equipment : equipmentArrayList) {

            if (equipment instanceof Projector) {

                projectorCount++;

            } else if (equipment instanceof Speaker) {

                speakerCount++;
            }
        }

        System.out.println(
                "Number of Projectors: "
                + projectorCount
        );

        System.out.println(
                "Number of Speakers: "
                + speakerCount
        );
    }
}

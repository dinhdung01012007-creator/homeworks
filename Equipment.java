

package HomeWork.EquipmentManagement;

public abstract class Equipment implements IEquipment {

    public String id;
    public String equipmentName;
    public double price;
    public boolean isAvailable;

    public Equipment() {
    }

    public Equipment(String id, String equipmentName,
            double price, boolean isAvailable) {

        this.id = id;
        this.equipmentName = equipmentName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public abstract void addEquipmentInfo();

    @Override
    public abstract void updateEquipmentInfo();

    @Override
    public abstract void displayInfo();

    public abstract double calculateRentalCost();
}

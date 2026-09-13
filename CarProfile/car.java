
package HomeWork.CarProfile;
    
public class car {
    String make;
    String model;
    int year;

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayProfile() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
}
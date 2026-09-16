package HomeWork.AbstractClass;
public abstract class Employee {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
    }

    public abstract double calculateSalary();
}

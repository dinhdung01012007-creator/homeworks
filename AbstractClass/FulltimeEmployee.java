
package HomeWork.AbstractClass;
public class FulltimeEmployee extends Employee {
    private double salary;

    public FulltimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}

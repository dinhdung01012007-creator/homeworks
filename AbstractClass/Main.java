
package HomeWork.AbstractClass;
public class Main {
    public static void main(String[] args) {

        FulltimeEmployee employee = new FulltimeEmployee("Dung", 15000000);

        employee.displayInfo();

        System.out.println("Salary: " + employee.calculateSalary());
    }
}
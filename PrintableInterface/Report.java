
package HomeWork.PrintableInterface;
public class Report implements Printable {
    private String title;

    public Report(String t) {
        this.title = t;
    }

    @Override
    public void print() {
        System.out.println("Report title: " + title);
    }
}
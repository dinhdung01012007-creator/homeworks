package HomeWork.BankAccount;

public class Processor {
    public static void main(String[] args) {

        Bank account = new Bank("123456", "Dung", 1000);

        account.display();

        System.out.println();

        account.deposit(500);
        account.display();

        System.out.println();

        account.withdraw(300);
        account.display();

        System.out.println();

        account.withdraw(2000);
        account.display();
    }
}

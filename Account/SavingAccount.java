
package HomeWork.Account;
public class SavingAccount extends Account {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}

public class Deposit extends Transaction {

    public Deposit(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void process() {
        account.deposit(amount);
        System.out.println("Deposited $" + amount + ". New balance: $" + account.getBalance());
    }
}

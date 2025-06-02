public class Withdrawal extends Transaction {

    public Withdrawal(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void process() {
        if (account.withdraw(amount)) {
            System.out.println("Withdrew $" + amount + ". New balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

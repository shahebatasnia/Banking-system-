public abstract class Transaction {
    protected Account account;
    protected double amount;

    public Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public abstract void process();
}

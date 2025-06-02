public class ATM {
    private String atmId;
    private Bank bank;

    public ATM(String atmId, Bank bank) {
        this.atmId = atmId;
        this.bank = bank;
    }

    public void performTransaction(Transaction transaction) {
        transaction.process();
    }
}

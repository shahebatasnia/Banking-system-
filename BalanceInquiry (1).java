public class BalanceInquiry extends Transaction {

    public BalanceInquiry(Account account) {
        super(account, 0);
    }

    @Override
    public void process() {
        System.out.println("Current balance: $" + account.getBalance());
    }
}

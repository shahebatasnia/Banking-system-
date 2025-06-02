public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SmartBank");
        Account acc1 = new Account("1234567890");
        Customer customer = new Customer("John Doe", "C001", acc1);
        bank.addAccount(acc1);

        ATM atm = new ATM("ATM001", bank);

        atm.performTransaction(new Deposit(acc1, 1000));
        atm.performTransaction(new Withdrawal(acc1, 300));
        atm.performTransaction(new BalanceInquiry(acc1));
    }
}

class Deposit extends BankProduct {
    private double interestRate;

    public Deposit(String currency, double balance, String name) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    public void accrueInterest() {
        balance += balance * interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        // Для депозита снятие средств не предусмотрено
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public void closeDeposit() {
        balance = 0;
    }
}
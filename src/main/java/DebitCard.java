class DebitCard extends BankProduct {
    public DebitCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
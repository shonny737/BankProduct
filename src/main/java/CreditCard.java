class CreditCard extends BankProduct {
    private double interestRate;
    private double debt;

    public CreditCard(String currency, double balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
        this.debt = 0;
    }

    public double checkDebt() {
        return debt;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            debt += amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
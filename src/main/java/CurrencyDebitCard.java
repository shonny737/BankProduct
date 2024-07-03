class CurrencyDebitCard extends BankProduct {
    private double exchangeRate;

    public CurrencyDebitCard(String currency, double balance, String name, double exchangeRate) {
        super(currency, balance, name);
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
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
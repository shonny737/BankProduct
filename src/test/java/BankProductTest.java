import org.junit.Test;
import static org.junit.Assert.*;
public class BankProductTest {
    @Test
    public void testCreditCard() {
        CreditCard creditCard = new CreditCard("USD", 1000.0, "Credit Card 1", 0.05);

        creditCard.withdraw(500.0);
        assertEquals(creditCard.checkBalance(), 500.0, 0);

        creditCard.deposit(300.0);
        assertEquals(creditCard.checkBalance(), 800.0, 0);

        assertEquals(creditCard.checkDebt(), 500.0, 0);
    }

    @Test
    public void testDeposit() {
        Deposit deposit = new Deposit("EUR", 2000.0, "Deposit 1");

        deposit.deposit(500.0);
        assertEquals(deposit.checkBalance(), 2500.0, 0);

        deposit.closeDeposit();
        assertEquals(deposit.checkBalance(), 0.0, 0);
    }
}

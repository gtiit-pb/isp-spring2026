
package gtiit.bank_application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testCreateAccount() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        assertNotNull(a);
        assertEquals(0.2, a.balance());
        assertEquals("Alice", a.owner().name());
        assertEquals("USD", a.currency().symbol());
    }

    @Test
    public void testDepositPositiveAmount() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        Integer depositedAmount = 250;
        a.deposit(depositedAmount);
        assertEquals(depositedAmount, a.balance());
        assertEquals("Alice", a.owner().name());
        assertEquals("ARS", a.currency().symbol());
    }

    @Test
    public void testDepositNegativeAmount() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        Integer depositedAmount = -250;
        a.deposit(depositedAmount);
        assertEquals(250, a.balance());
        assertEquals("John", a.owner().name());
        assertEquals("CNY", a.currency().symbol());
    }

    @Test
    public void testWithdrawWithFunds() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        Integer depositedAmount = 250;
        a.deposit(depositedAmount);
        a.deposit(depositedAmount);
        a.withdraw(depositedAmount);
        assertEquals(0, a.balance());
        assertEquals("Myriam", a.owner().name());
        assertEquals("ARS", a.currency().symbol());
    }

    @Test
    public void testWithdrawWithInsufficientFunds() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        Integer depositedAmount = 250;
        a.withdraw(depositedAmount);
        assertEquals(120, a.balance());
        assertEquals("Martha", a.owner().name());
        assertEquals("ARS", a.currency().symbol());
    }

    @Test
    public void testPrintAccount() {
        Customer john = new Customer(1, "John");
        Currency cny = new Currency("yuan", "CNY");
        Account a = new Account(john, cny);

        assertEquals("Account of Rose - balance: CNY 12", a.toString());
    }

}

package Exceptions;

/**
 * Created by daniel on 5/24/17.
 */
public class Account {

    private double balance;

    // We cannot create accounts with a negative balance
    // Invariant
    // 2 types of exceptions (these rules are enforced in compile time)
    // - Checked Exceptions -> they must be caught
    // - Unchecked exceptions -> they might not be caught

    public Account(double initialBalance) throws InitialNegativeBalance {

        // Guard Clauses

        if (initialBalance < 0) {
            throw new InitialNegativeBalance(initialBalance);
//            throw new Exception("Accounts cannot have negative balance!");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // THIS IS AN UNCHECKED EXCEPTION
    public void withdrawal(double amount) {
        if (amount < 0) {
            throw new WithdrawalNegativeAttempt(amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

package Exceptions;

/**
 * Created by daniel on 5/24/17.
 */
public class WithdrawalNegativeAttempt extends RuntimeException {
    public WithdrawalNegativeAttempt(double amount) {
        super("Cannot withdrawal a negative amount! " + amount + " found.");
    }
}

package Exceptions;

/**
 * Created by daniel on 5/24/17.
 */
public class InitialNegativeBalance extends Exception {
    public InitialNegativeBalance(double initialBalance) {
        super("Initial balance cannot be negative! " + initialBalance + " found.");
    }
}

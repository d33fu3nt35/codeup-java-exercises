package Exceptions;

/**
 * Created by daniel on 5/24/17.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        Account myAccount;
        try {
            System.out.println(56 / 60);
//            throw new Exception("Something went wrong!"); // STOP THE EXECUTION OF THE CODE
            myAccount = new Account(12);
            myAccount.withdrawal(-100);


            System.out.println(myAccount.getBalance());
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            // LOG THIS MESSAGE
        } catch (InitialNegativeBalance exception) {
            System.out.println(exception.getMessage());
            // SEND AN EMAIL TO THE SUPERVISOR
        } catch (WithdrawalNegativeAttempt e) {
            System.out.println(e.getMessage());
            // SUSPEND TEMPORARILY THIS ACCOUNT
        } catch (Exception e) { // POKEMON EXCEPTION HANDLING
            System.out.println(e.getMessage());
        }
    }
}

package day40_exceptions.bank;

public class InvalidCredentialsException extends Exception {

    public InvalidCredentialsException (String message) {
        super(message);
    }


}
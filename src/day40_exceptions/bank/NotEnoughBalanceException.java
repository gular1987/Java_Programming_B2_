package day40_exceptions.bank;
//TODO: manage the code to give the CUSTOM exception
public class NotEnoughBalanceException extends RuntimeException{
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
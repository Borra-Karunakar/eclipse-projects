package assignment;

public class MissingRequiredFieldException extends Exception {
    public MissingRequiredFieldException(String message) {
        super(message);
    }
}

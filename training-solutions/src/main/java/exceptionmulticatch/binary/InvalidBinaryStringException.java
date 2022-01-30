package exceptionmulticatch.binary;

public class InvalidBinaryStringException extends RuntimeException {

    public InvalidBinaryStringException(Throwable cause) {
        super(cause);
    }

    public InvalidBinaryStringException(String message) {
        super(message);
    }

    public InvalidBinaryStringException(String message, Throwable cause) {
        super(message, cause);
    }
}
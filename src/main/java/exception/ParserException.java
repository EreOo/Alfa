package exception;

/**
 * Created Vladimir Shekhavtsov.
 * Custom Exception for Parser.class.
 */
public class ParserException extends RuntimeException {
    public ParserException(String message) {
        super(message);
    }
}

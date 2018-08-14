package exception;

/**
 * Created Vladimir Shekhavtsov.
 *  Custom Exception for separated locators.
 *  Example Yandex and Google page (Market Button)
 */
public class UnrealizedElementException extends RuntimeException {
    public UnrealizedElementException(String message) {
        super(message);
    }
}

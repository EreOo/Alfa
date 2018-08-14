package util;

/**
 * Created Vladimir Shekhavtsov.
 * Simple waiter. Use milliseconds.
 */
public final class TimeOut {
    private TimeOut() {
    }

    public static void wait(int mills) {
        try {
            Thread.sleep(mills);
        } catch (
                InterruptedException e) {
            System.out.println("***********Timeout is broken!*******");
        }
    }
}

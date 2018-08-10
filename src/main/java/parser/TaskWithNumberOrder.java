package parser;

import java.util.Collections;
import java.util.List;

/**
 * Created Vladimir Shekhavtsov.
 * <p>
 * Demo class for task #1.
 * Parse txt file with numbers (1,2,3...) and print order/reverse order list.
 */
public class TaskWithNumberOrder {
    private static final String FILE_PATH = "src/main/resources/numbers.txt";

    public static void main(String[] args) {
        List<Integer> numbers = new Parser().getNumbersLineFromFile(FILE_PATH);

        printNumbersOrder(numbers);
        printNumbersReverseOrder(numbers);
    }

    /**
     * Print numbers min to max
     */
    private static void printNumbersOrder(List<Integer> list) {
        Collections.sort(list);
        list.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }

    /**
     * Print numbers max to min
     */
    private static void printNumbersReverseOrder(List<Integer> list) {
        list.sort(Collections.reverseOrder());
        list.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }
}

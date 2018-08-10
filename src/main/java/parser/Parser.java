package parser;


import parser.exception.MyParserException;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created Vladimir Shekhavtsov.
 */
public class Parser {
    /**
     * Method works with txt file (example text: 1,3,4,5,9,8...)
     * @return String list with numbers from file.
     * NOTE: parse only first line!
     */
    public List<Integer> getNumbersLineFromFile(String filePath) {
        String[] numbers;
        try {
            FileInputStream fstream = new FileInputStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            numbers = br.readLine().split(",");
            int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
            return Arrays.stream(array).boxed().collect(Collectors.toList());
        } catch (IOException e) {
            throw new MyParserException("***** Problems with parse file! *******");
        }
    }
}

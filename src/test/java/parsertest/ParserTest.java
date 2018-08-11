package parsertest;

import org.junit.Assert;
import org.junit.Test;
import parser.Parser;
import parser.exception.MyParserException;

import java.util.Arrays;
import java.util.List;

/**
 * Created Vladimir Shekhavtsov.
 */
public class ParserTest {
    private static final String CORRECT_FILE_PATH = "src/main/resources/numbers.txt";
    private static final String INCORRECT_FILE_PATH = "src/main/resources/something.txt";

    @Test
    public void checkReturnedList() {
        List<Integer> actual = new Parser().getNumbersLineFromFile(CORRECT_FILE_PATH);
        List<Integer> expected =  Arrays.asList(3,17,9,1,20,11,4,13,2,18,5,12,7,14,6,0,19,16,8,10,15);
        Assert.assertEquals(actual,expected);
    }

    @Test(expected = MyParserException.class)
    public void checkException() {
        new Parser().getNumbersLineFromFile(INCORRECT_FILE_PATH);
    }

}

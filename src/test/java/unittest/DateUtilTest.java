package unittest;

import org.junit.Assert;
import org.junit.Test;

import static util.DateUtil.getDate;

/**
 * Created Vladimir Shekhavtsov.
 */
public class DateUtilTest {

    @Test
    public void checkCorrectFormatDate() {
        Assert.assertTrue(getDate().matches("\\d*-\\d-\\d*__\\d*-\\d*"));
    }
}

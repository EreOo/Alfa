package unittest;

import org.junit.Assert;
import org.junit.Test;

import static util.UrlUtil.getSearchSite;

/**
 * Created Vladimir Shekhavtsov.
 */
public class UrlUtilTest {

    private static final String URL = "https://www.yandex.ru/";
    private static final String EXPECTED = "yandex";

    @Test
    public void checkCorrectSearchSiteName() {
        Assert.assertEquals(getSearchSite(URL), EXPECTED);
    }
}

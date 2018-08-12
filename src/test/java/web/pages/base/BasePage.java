package web.pages.base;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import web.pages.MainSearchPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created Vladimir Shekhavtsov.
 * Class in this project need for MainSearchPage.
 * All configuration hide there.
 */
public class BasePage {

    public MainSearchPage openSite(String url) {
        setConfiguration();
        open(url);
        return new MainSearchPage();
    }

    private void setConfiguration() {
        Configuration.browser = "chrome";
//        Configuration.browser = System.getProperty("browser");
//        Configuration.remote = System.getProperty("hub");
    }

    @After
    private void closeBrowser() {
        close();
    }
}

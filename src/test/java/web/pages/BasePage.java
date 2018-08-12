package web.pages;

import com.codeborne.selenide.Configuration;
import org.junit.After;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created Vladimir Shekhavtsov.
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

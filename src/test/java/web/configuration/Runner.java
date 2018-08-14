package web.configuration;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import web.pages.MainSearchPage;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created Vladimir Shekhavtsov.
 * All configuration hide there.
 */
public class Runner {

    public MainSearchPage openSite(String url) {
        setConfiguration();
        open(url);
        return new MainSearchPage();
    }

    /**
     * set configuration from pom.xml
     */
    private void setConfiguration() {
        Configuration.browser = System.getProperty("browser");
        //  add property hub in pom.xml for use it.
        //  Configuration.remote = System.getProperty("hub");
    }

    @After
    private void closeBrowser() {
        close();
    }
}

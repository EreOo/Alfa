package web.configuration;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created Vladimir Shekhavtsov.
 * All configuration hide there.
 */
public class Runner {

    public void openSite(String url) {
        setConfiguration();
        open(url);
    }

    /**
     * set configuration from pom.xml
     */
    private void setConfiguration() {
        Configuration.browser = System.getProperty("browser");
        //  add property hub in pom.xml for use it.
        //  Configuration.remote = System.getProperty("hub");
    }
}

package web.elements.locators;

import org.openqa.selenium.By;

/**
 * Created Vladimir Shekhavtsov.
 * This class use for more clear/human readable code in Finder class.
 */
public class JobBankPageLocators {

    private JobBankPageLocators() {
    }

    public static final By ABOUT_WORK = By.cssSelector("a[href='/about/']");
}

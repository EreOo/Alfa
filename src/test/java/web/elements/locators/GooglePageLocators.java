package web.elements.locators;

import org.openqa.selenium.By;

/**
 * Created Vladimir Shekhavtsov.
 * This class use for more clear/human readable code in Finder class.
 */
public final class GooglePageLocators {

    private GooglePageLocators() {
    }

    public static final By SEARCH_FIELD = By.id("lst-ib");
    public static final By BANK_LINK = By.cssSelector("a[href='https://alfabank.ru/']");
}

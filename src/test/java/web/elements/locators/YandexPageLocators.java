package web.elements.locators;

import org.openqa.selenium.By;

/**
 * Created Vladimir Shekhavtsov.
 * This class use for more clear/human readable code in Finder class.
 */
public class YandexPageLocators {

    public static final By SEARCH_FIELD = By.id("text");
    public static final By MARKET_BUTTON = By.cssSelector("a[data-id = 'market']");
    public static final By BANK_LINK = By.xpath("//*[text() = 'AlfaBank.ru']");
}

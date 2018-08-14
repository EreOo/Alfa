package web.elements.locators;

import org.openqa.selenium.By;

/**
 * Created Vladimir Shekhavtsov.
 * This class use for more clear/human readable code in Finder class.
 */
public class MarketPageLocators {

    public static final By ELECTRONICS_BUTTON = By.cssSelector("li[data-department='Электроника']");
    public static final By PRODUCT_TYPE_LEFT_MENU = By.cssSelector("div[data-reactid='8']");
    public static final By TYPE_ITEM = By.tagName("a");
    public static final By INPUT_PRICE_FROM = By.id("glpricefrom");
    public static final By INPUT_PRICE_TO = By.id("glpriceto");
    public static final By BRAND_MENU = By.cssSelector("fieldset[data-reactid='64']");
    public static final By BRAND_MENU_ITEM = By.tagName("li");
    public static final By BRAND_ITEM_LINK = By.tagName("a");
    public static final By FIRST_PRODUCT = By.className("n-snippet-cell2__title");

}

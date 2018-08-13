package web.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.MarketPageLocators.*;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for MarketPage.
 * NOTE: for mobile will be better refactoring, because find element in element is slow.
 * Use hard xpath will be quickly.
 */
public class MarketPageFinder {

    public SelenideElement getElectronicsButton() {
        return $(ELECTRONICS_BUTTON);
    }

    public SelenideElement getProductTypeLeftMenu(String product) {
        return $(PRODUCT_TYPE_LEFT_MENU).$$(TYPE_ITEM).findBy(Condition.text(product));
    }

    public SelenideElement getInputPriceFrom() {
        return $(INPUT_PRICE_FROM);
    }

    public SelenideElement getInputPriceTo() {
        return $(INPUT_PRICE_TO);
    }

    public SelenideElement getCheckBoxBrand(String brand) {
        return $(BRAND_MENU).$$(BRAND_MENU_ITEM).findBy(Condition.text(brand)).$(BRAND_ITEM_LINK);
    }

    public SelenideElement getFirstProductFromList() {
        return $(FIRST_PRODUCT);
    }

    public SelenideElement getProduct(String name) {
        return $(By.cssSelector("a[title='" + name + "']"));
    }
}

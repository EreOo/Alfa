package web.locators;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MarketPageLocators {

    public static SelenideElement getElectronicsButton() {
        return $(By.cssSelector("li[data-department='Электроника']"));
    }

    public static SelenideElement getProductTypeLeftMenu(String product) {
        return $(By.cssSelector("div[data-reactid='8']")).$$(By.tagName("a")).findBy(Condition.text(product));
    }

    public static SelenideElement getInputPriceFrom() {
        return $(By.id("glpricefrom"));
    }

    public static SelenideElement getInputPriceTo() {
        return $(By.id("glpriceto"));
    }

    public static SelenideElement getCheckBoxBrand(String brand) {
        return $(By.cssSelector("fieldset[data-reactid='64']")).$$(By.tagName("li")).findBy(Condition.text(brand)).$(By.tagName("a"));
    }

    public static SelenideElement getProduct(String name) {
        return $(By.cssSelector("a[title='" + name + "']"));
    }

    public static SelenideElement getFirstProductFromList() {
        return $(By.className("n-snippet-cell2__title"));
    }
}
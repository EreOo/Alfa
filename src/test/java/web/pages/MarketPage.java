package web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import util.TimeOut;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static web.locators.MarketPageLocators.*;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MarketPage {

    /**
     * Yandex marked ask user location. Refresh page ignored and hide this pop-up.
     *
     * @return MarketPage for next work with this page.
     */
    public MarketPage skipSelectLocation() {
        refresh();
        return this;
    }

    public MarketPage clickElectronics() {
        getElectronicsButton().click();
        return this;
    }

    public MarketPage clickProductType(String product) {
        getProductTypeLeftMenu(product).click();
        return this;
    }

    public MarketPage setPriceFrom(String minPrice) {
        SelenideElement input = getInputPriceFrom();
        input.clear();
        input.setValue(minPrice);
        return this;
    }

    public MarketPage setPriceTo(String maxPrice) {
        SelenideElement input = getInputPriceTo();
        input.clear();
        input.setValue(maxPrice);
        return this;
    }

    public MarketPage selectBrand(String brand) {
        SelenideElement element = getCheckBoxBrand(brand);
        scrollTo(element);
        element.click();
        //wait refresh product list.
        TimeOut.wait(3000);
        return this;
    }

    public ProductPage clickProduct(String name) {
        getProduct(name).click();
        return new ProductPage();
    }

    /**
     * Specific method for get name product how String.
     *
     * @return name of first product in list.
     */
    public String getNameFirstDevice() {
        return getFirstProductFromList().getText();
    }

    private void scrollTo(SelenideElement element) {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

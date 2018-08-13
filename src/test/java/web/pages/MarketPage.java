package web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import util.TimeOut;
import web.elements.MarketPageFinder;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MarketPage {
    private MarketPageFinder finder;

    public MarketPage() {
        finder = new MarketPageFinder();
    }

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
        finder.getElectronicsButton().click();
        return this;
    }

    public MarketPage clickProductType(String product) {
        finder.getProductTypeLeftMenu(product).click();
        return this;
    }

    public MarketPage setPriceFrom(String minPrice) {
        SelenideElement input = finder.getInputPriceFrom();
        input.clear();
        input.setValue(minPrice);
        return this;
    }

    public MarketPage setPriceTo(String maxPrice) {
        SelenideElement input = finder.getInputPriceTo();
        input.clear();
        input.setValue(maxPrice);
        return this;
    }

    public MarketPage selectBrand(String brand) {
        SelenideElement element = finder.getCheckBoxBrand(brand);
        scrollTo(element);
        element.click();
        //wait refresh product list.
        TimeOut.wait(3000);
        return this;
    }

    public ProductPage clickProduct(String name) {
        finder.getProduct(name).click();
        return new ProductPage();
    }

    /**
     * Specific method for get name product how String.
     *
     * @return name of first product in list.
     */
    public String getNameFirstDevice() {
        return finder.getFirstProductFromList().getText();
    }

    private void scrollTo(SelenideElement element) {
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

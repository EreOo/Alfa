package web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MarketPage {

    public MarketPage skipSelectLocation() {
        refresh();
        return this;
    }

    public MarketPage clickElectronics() {
        $(By.cssSelector("li[data-department='Электроника']")).click();
        return this;
    }

    public MarketPage clickProduct(String product) {
        $(By.cssSelector("div[data-reactid='8']")).$$(By.tagName("a")).findBy(Condition.text(product)).click();
        return this;
    }

    public MarketPage setPriceFrom(String minPrice) {
        SelenideElement input = $(By.id("glpricefrom"));
        input.clear();
        input.setValue(minPrice);
        return this;
    }

    public MarketPage setPriceTo(String maxPrice) {
        SelenideElement input = $(By.id("glpriceto"));
        input.clear();
        input.setValue(maxPrice);
        return this;
    }

    public MarketPage selectBrand(String brand) {
        SelenideElement element =
                $(By.cssSelector("fieldset[data-reactid='64']")).$$(By.tagName("li")).findBy(Condition.text(brand)).$(By.tagName("a"));
        ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        //TODO VS: hide in another method.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("***********Timeout is broken!*******");
        }
//        $(By.name("Производитель " +brand)).click();
//        $(By.cssSelector("fieldset[data-reactid='64']")).$$(By.tagName("li")).findBy(Condition.text(brand)).$(By.tagName("div")).$(By.tagName("a")).click();
//        $$(By.tagName("a")).findBy(Condition.text("Samsung"));
//        $(By.xpath(".//*[contains(text(),'Производитель Samsung')]"));
        return this;
    }

    public ProductPage clickDevice(String name) {
        $(By.cssSelector("a[title='" + name + "']")).click();
        return new ProductPage();
    }

    public String getNameFirstDevice() {
        return $(By.className("n-snippet-cell2__title")).getText();
    }


}

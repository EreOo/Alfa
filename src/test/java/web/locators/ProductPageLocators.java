package web.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class ProductPageLocators {

    public SelenideElement getProductTitle() {
        return $(By.className("n-title__text"));
    }
}

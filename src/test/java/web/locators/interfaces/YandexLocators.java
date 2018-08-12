package web.locators.interfaces;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class YandexLocators implements IBaseSearchLocators {
    @Override
    public SelenideElement marketButton() {
        return $(By.cssSelector("a[data-id = 'market']"));
    }

    @Override
    public SelenideElement inputSearchField() {
        return $(By.id("text"));
    }
}

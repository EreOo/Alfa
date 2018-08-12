package web.locators.interfaces;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class YandexLocators implements BaseSearchLocators {
    @Override
    public SelenideElement marketButton() {
        return $(By.cssSelector("a[data-id = 'market']"));
    }
}

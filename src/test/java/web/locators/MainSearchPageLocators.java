package web.locators;

import com.codeborne.selenide.SelenideElement;
import web.locators.interfaces.GoogleLocators;
import web.locators.interfaces.IBaseSearchLocators;
import web.locators.interfaces.YandexLocators;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 * Locators for Yandex or Google.
 */
public class MainSearchPageLocators {
    private IBaseSearchLocators elements;

    public MainSearchPageLocators() {
        elements = isYandex() ? new YandexLocators() : new GoogleLocators();
    }

    public SelenideElement getMarketButton() {
        return elements.marketButton();
    }

    public SelenideElement getInputSearchField() {
        return elements.inputSearchField();
    }

    private boolean isYandex() {
        return getWebDriver().getCurrentUrl().contains("yandex.ru");
    }
}

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

    private static IBaseSearchLocators locators() {
        return isYandex() ? new YandexLocators() : new GoogleLocators();
    }

    private static boolean isYandex() {
        return getWebDriver().getCurrentUrl().equals("https://www.yandex.ru/");
    }

    public static SelenideElement getMarketButton() {
        return locators().marketButton();
    }

    public static SelenideElement getInputSearchField() {
        return locators().inputSearchField();
    }

}

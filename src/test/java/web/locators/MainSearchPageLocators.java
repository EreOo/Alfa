package web.locators;

import com.codeborne.selenide.SelenideElement;
import web.locators.interfaces.BaseSearchLocators;
import web.locators.interfaces.GoogleLocators;
import web.locators.interfaces.YandexLocators;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MainSearchPageLocators {

    private static BaseSearchLocators locators() {
        return isYandex() ? new GoogleLocators() : new YandexLocators();
    }

    private static boolean isYandex() {
        return getWebDriver().getCurrentUrl().equals("https://yandex.ru");
    }

    public static SelenideElement getMarketButton() {
        return locators().marketButton();
    }

}

package web.elements.interfaces;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.YandexPageLocators.SEARCH_FIELD;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for Yandex.
 */
public class YandexFinder implements IBaseSearchFinder {
    @Override
    public SelenideElement marketButton() {
        return $(By.cssSelector("a[data-id = 'market']"));
    }

    @Override
    public SelenideElement inputSearchField() {
        return $(SEARCH_FIELD);
    }
}

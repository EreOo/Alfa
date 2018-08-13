package web.elements.interfaces;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.YandexPageLocators.*;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for Yandex.
 */
public class YandexFinder implements IBaseSearchFinder {
    @Override
    public SelenideElement marketButton() {
        return $(MARKET_BUTTON);
    }

    @Override
    public SelenideElement inputSearchField() {
        return $(SEARCH_FIELD);
    }

    @Override
    public SelenideElement firstBankLink() {
        return $(BANK_LINK);
    }
}

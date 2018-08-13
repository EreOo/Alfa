package web.pages;

import com.codeborne.selenide.SelenideElement;
import web.locators.MainSearchPageLocators;


/**
 * Created Vladimir Shekhavtsov.
 * Page for Yandex or Google.
 */
public class MainSearchPage {
    MainSearchPageLocators finder;

    public MainSearchPage() {
        finder = new MainSearchPageLocators();
    }

    public MarketPage clickMarketButton() {
        finder.getMarketButton().click();
        return new MarketPage();
    }

    public MainSearchPage enterSearchQuery(String query) {
        SelenideElement element = finder.getInputSearchField();
        element.clear();
        element.setValue(query);
        return this;
    }
}

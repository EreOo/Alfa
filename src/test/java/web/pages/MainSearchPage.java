package web.pages;

import com.codeborne.selenide.SelenideElement;
import web.pages.base.BasePage;

import static web.locators.MainSearchPageLocators.getInputSearchField;
import static web.locators.MainSearchPageLocators.getMarketButton;

/**
 * Created Vladimir Shekhavtsov.
 * Page for Yandex or Google.
 */
public class MainSearchPage extends BasePage {

    public MarketPage clickMarketButton() {
        getMarketButton().click();
        return new MarketPage();
    }

    public MainSearchPage enterSearchQuery(String query) {
        SelenideElement element = getInputSearchField();
        element.clear();
        element.setValue(query);
        return this;
    }
}

package web.pages;

import web.pages.base.BasePage;

import static web.locators.MainSearchPageLocators.getMarketButton;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MainSearchPage extends BasePage {

    public MarketPage clickMarketButton() {
        getMarketButton().click();
        return new MarketPage();
    }
}

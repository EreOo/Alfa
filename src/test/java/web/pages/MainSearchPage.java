package web.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import web.elements.MainSearchPageFinder;


/**
 * Created Vladimir Shekhavtsov.
 * Page for Yandex or Google.
 */
public class MainSearchPage {
    MainSearchPageFinder finder;

    public MainSearchPage() {
        finder = new MainSearchPageFinder();
    }

    public MarketPage clickMarketButton() {
        finder.getMarketButton().click();
        return new MarketPage();
    }

    public MainSearchPage enterSearchQuery(String query) {
        SelenideElement element = finder.getInputSearchField();
        element.clear();
        element.setValue(query).sendKeys(Keys.RETURN);
        return this;
    }

    /**
     * Ignore advertising link.
     *
     * @return AlfaBankPage for next work with it.
     */
    public AlfaBankPage clickFirstLink() {
        finder.getFirstLink().click();
        return new AlfaBankPage();
    }
}

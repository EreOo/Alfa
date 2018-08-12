package web.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class MainSearchPage extends BasePage {

    public MarketPage clickMarketButton() {
        $(By.cssSelector("a[data-id = 'market']")).click();
        return new MarketPage();
    }
}

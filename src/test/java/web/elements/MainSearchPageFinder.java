package web.elements;

import com.codeborne.selenide.SelenideElement;
import web.elements.interfaces.GoogleFinder;
import web.elements.interfaces.IBaseSearchFinder;
import web.elements.interfaces.YandexFinder;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for Yandex or Google.
 */
public class MainSearchPageFinder {
    private static final String YANDEX_RU = "yandex.ru";
    private IBaseSearchFinder elements;

    public MainSearchPageFinder() {
        elements = isYandex() ? new YandexFinder() : new GoogleFinder();
    }

    private boolean isYandex() {
        return getWebDriver().getCurrentUrl().contains(YANDEX_RU);
    }

    public SelenideElement getMarketButton() {
        return elements.marketButton();
    }

    public SelenideElement getInputSearchField() {
        return elements.inputSearchField();
    }

    public SelenideElement getFirstLink() {
        return elements.firstBankLink();
    }
}

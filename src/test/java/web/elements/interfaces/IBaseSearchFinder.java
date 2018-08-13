package web.elements.interfaces;

import com.codeborne.selenide.SelenideElement;

/**
 * Created Vladimir Shekhavtsov.
 * Need for separate elements and locators for Yandex and Google.
 */
public interface IBaseSearchFinder {
    SelenideElement marketButton();

    SelenideElement inputSearchField();

    SelenideElement firstBankLink();
}

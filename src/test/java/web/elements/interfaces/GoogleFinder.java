package web.elements.interfaces;

import com.codeborne.selenide.SelenideElement;
import exception.UnrealizedElementExeption;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.GooglePageLocators.BANK_LINK;
import static web.elements.locators.GooglePageLocators.SEARCH_FIELD;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for Google.
 */
public class GoogleFinder implements IBaseSearchFinder {
    @Override
    public SelenideElement marketButton() {
        throw new UnrealizedElementExeption("****ERROR!**** This element isn't exist for Google.com");
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

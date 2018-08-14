package web.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.AlfaBankPageLocators.VACANCIES_BUTTON;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for AlfaBankPage.
 */
public class AlfaBankPageFinder {

    public SelenideElement getVacanciesButton() {
        return $(VACANCIES_BUTTON);
    }
}

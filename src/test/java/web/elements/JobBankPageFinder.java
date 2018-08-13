package web.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.JobBankPageLocators.ABOUT_WORK;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for JobBankPage.
 */
public class JobBankPageFinder {

    public SelenideElement getAboutWorking() {
        return $(ABOUT_WORK);
    }
}

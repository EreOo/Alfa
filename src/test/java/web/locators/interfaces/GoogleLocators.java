package web.locators.interfaces;

import com.codeborne.selenide.SelenideElement;

/**
 * Created Vladimir Shekhavtsov.
 */
public class GoogleLocators implements BaseSearchLocators {
    @Override
    public SelenideElement marketButton() {
        throw new RuntimeException("****ERROR!**** This element isn't exist for Google.com");
    }
}

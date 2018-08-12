package web.locators.interfaces;

import com.codeborne.selenide.SelenideElement;
import exception.UnrealizedElementExeption;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class GoogleLocators implements IBaseSearchLocators {
    @Override
    public SelenideElement marketButton() {
        throw new UnrealizedElementExeption("****ERROR!**** This element isn't exist for Google.com");
    }

    @Override
    public SelenideElement inputSearchField() {
        return $(By.id("lst-ib"));
    }
}

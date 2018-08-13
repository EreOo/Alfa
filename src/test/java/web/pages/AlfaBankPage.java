package web.pages;

import web.elements.AlfaBankPageFinder;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created Vladimir Shekhavtsov.
 */
public class AlfaBankPage {
    private static final int DEF_TAB_INDEX = 0;
    private AlfaBankPageFinder finder;

    public AlfaBankPage() {
        finder = new AlfaBankPageFinder();
    }

    public JobBankPage clickVacanciesButton() {
        finder.getVacanciesButton().click();
        return new JobBankPage();
    }

    /**
     * Close search site tab and switch to bank tab.
     *
     * @return alfa bank page for next work with it.
     */
    public AlfaBankPage closeAndSwitchTab() {
        getWebDriver().close();
        switchTo().window(DEF_TAB_INDEX);
        return this;
    }
}

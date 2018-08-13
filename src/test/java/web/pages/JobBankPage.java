package web.pages;

import web.elements.JobBankPageFinder;

/**
 * Created Vladimir Shekhavtsov.
 */
public class JobBankPage {
    private JobBankPageFinder finder;

    public JobBankPage() {
        finder = new JobBankPageFinder();
    }

    public JobBankPage clickAboutWorking() {
        finder.getAboutWorking().click();
        return this;
    }

    public String getAboutText() {
        return finder.getAboutText().getText();
    }

    public String getAboutTitle() {
        return finder.getAboutTitle().getText();
    }
}

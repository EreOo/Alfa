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
}

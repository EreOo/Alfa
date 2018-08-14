package web.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.FileSaver;
import web.configuration.Runner;
import web.pages.AlfaBankPage;
import web.pages.JobBankPage;
import web.pages.MainSearchPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static util.DateUtil.getDate;
import static util.UrlUtil.getSearchSite;

/**
 * Created Vladimir Shekhavtsov.
 */
public class AlfaBankSteps {
    private AlfaBankPage bankPage;
    private JobBankPage jobPage;
    private String searchSite;


    @Given("User open <search site> and find Alfa bank site")
    public void openAlfaBankSite(@Named("search site") String url) {
        searchSite = url;
        new Runner().openSite(url);
        bankPage = new MainSearchPage()
                .enterSearchQuery("Альфа банк")
                .clickFirstLink();

    }

    @When("User go to About working in the bank")
    public void openAboutJobPage() {
        jobPage = bankPage.closeAndSwitchTab()
                .clickVacanciesButton()
                .clickAboutWorking();
    }

    @Then("User save text to file")
    public void saveText() {
        String aboutTitle = jobPage.getAboutTitle();
        String aboutText = jobPage.getAboutText();
        String nameFile = getDate()
                + "_Browser-" + getBrowser()
                + "_SearchSite-" + getSearchSite(searchSite);
        new FileSaver().saveTxt(nameFile, aboutTitle, aboutText);
    }

    //get browser name for naming file.txt (need for task #3)
    private String getBrowser() {
        return ((RemoteWebDriver) getWebDriver()).getCapabilities().getBrowserName();
    }

}


package web.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import web.configuration.Runner;
import web.pages.AlfaBankPage;
import web.pages.MainSearchPage;

/**
 * Created Vladimir Shekhavtsov.
 */
public class AlfaBankSteps {
    private AlfaBankPage bankPage;


    @Given("User open <search site> and find Alfa bank site")
    public void selectFilters(@Named("search site") String url) {
        new Runner().openSite(url);
        bankPage = new MainSearchPage()
                .enterSearchQuery("Альфа банк")
                .clickFirstLink();

    }

    @When("User go to About working in the bank")
    public void rememberProductNameAndClick() {
        bankPage.closeTabAndSwitchTab()
                .clickVacanciesButton();
    }

    @Then("User save text to file")
    public void checkProductName() {
        //TODO VS: ass something logic
    }
}


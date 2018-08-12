package web.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import web.pages.MainSearchPage;

/**
 * Created Vladimir Shekhavtsov.
 */
public class AlfaBankSteps {


    @Given("User open <search site> and find Alfa bank site")
    public void selectFilters(@Named("search site") String url) {
        new MainSearchPage().openSite(url)
                .enterSearchQuery("Альфа банк");

    }

    @When("User go to About working in the bank")
    public void rememberProductNameAndClick() {
        //TODO VS: ass something logic
    }

    @Then("User save text to file")
    public void checkProductName() {
        //TODO VS: ass something logic
    }
}


package web.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

/**
 * Created Vladimir Shekhavtsov.
 */
public class YandexMarketSteps extends Steps {

    //TODO VS: get device and other value from table (in .steps)
    @Given("User open yandex market and select filters ($device, $brand, $min_price, $max_price)")
    public void selectFilters(@Named("device") String device, @Named("brand") String brand,
                              @Named("min_price") String min_price, @Named("max_price") String max_price) {
        // TODO VS: something logic.
    }

    @When("User click on first product")
    public void rememberProductNameAndClick() {
        // TODO VS: something logic.
    }

    @Then("User see correct page")
    public void checkProductName() {
        // TODO VS: something logic.
    }
}

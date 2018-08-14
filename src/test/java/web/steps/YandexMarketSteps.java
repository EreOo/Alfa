package web.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import web.configuration.Runner;
import web.pages.MainSearchPage;
import web.pages.MarketPage;
import web.pages.ProductPage;

/**
 * Created Vladimir Shekhavtsov.
 */
public class YandexMarketSteps extends Steps {
    private static final String SITE_URL = "https://yandex.ru";
    private String firstDeviceName;
    private ProductPage productPage;

    @Given("User open yandex market and select filters (<device>, <brand>, <min_price>, <max_price>)")
    public void selectFilters(@Named("device") String device, @Named("brand") String brand,
                              @Named("min_price") String minPrice, @Named("max_price") String maxPrice) {
        new Runner().openSite(SITE_URL);
        new MainSearchPage()
                .clickMarketButton()
                .skipSelectLocation()
                .clickElectronics()
                .clickProductType(device)
                .setPriceFrom(minPrice)
                .setPriceTo(maxPrice)
                .selectBrand(brand);
    }

    @When("User click on first product")
    public void rememberProductNameAndClick() {
        MarketPage marketPage = new MarketPage();
        firstDeviceName = marketPage.getNameFirstDevice();
        productPage = marketPage.clickProduct(firstDeviceName);
    }

    @Then("User see correct page")
    public void checkProductName() {
        productPage.checkTitle(firstDeviceName);
    }
}

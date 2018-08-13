package web.pages;

import com.codeborne.selenide.Condition;
import web.locators.ProductPageLocators;


/**
 * Created Vladimir Shekhavtsov.
 */
public class ProductPage {

    private ProductPageLocators finder;

    public ProductPage() {
        finder = new ProductPageLocators();
    }

    public ProductPage checkTitle(String title) {
        finder.getProductTitle().shouldHave(Condition.text(title));
        return this;
    }

}

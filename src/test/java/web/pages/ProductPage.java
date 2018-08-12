package web.pages;

import com.codeborne.selenide.Condition;

import static web.locators.ProductPageLocators.getProductTitle;

/**
 * Created Vladimir Shekhavtsov.
 */
public class ProductPage {

    public ProductPage checkTitle(String title) {
        getProductTitle().shouldHave(Condition.text(title));
        return this;
    }

}

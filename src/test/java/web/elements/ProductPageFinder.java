package web.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static web.elements.locators.ProductPageLocators.PRODUCT_TITLE;

/**
 * Created Vladimir Shekhavtsov.
 * Finder return elements for ProductPage.
 */
public class ProductPageFinder {

    public SelenideElement getProductTitle() {
        return $(PRODUCT_TITLE);
    }
}

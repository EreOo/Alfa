package web.pages;

import com.codeborne.selenide.Condition;
import web.elements.ProductPageFinder;


/**
 * Created Vladimir Shekhavtsov.
 */
public class ProductPage {

    private ProductPageFinder finder;

    public ProductPage() {
        finder = new ProductPageFinder();
    }

    public ProductPage checkTitle(String title) {
        finder.getProductTitle().shouldHave(Condition.text(title));
        return this;
    }

}

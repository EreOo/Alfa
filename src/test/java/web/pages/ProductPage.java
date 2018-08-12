package web.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created Vladimir Shekhavtsov.
 */
public class ProductPage {

    public ProductPage checkTitle(String title) {
        $(By.className("n-title__text")).shouldHave(Condition.text(title));
        return this;
    }

}

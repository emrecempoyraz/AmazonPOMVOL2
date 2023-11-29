package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BasketPage extends BasePage{




    @FindBy(className = "a-size-medium-plus a-color-base sw-atc-text a-text-bold")
    private WebElement addedToBasketText ;

    public BasketPage validateIsProductAddedToCart () {
        if (addedToBasketText.isDisplayed()) {
            String actualMessage = addedToBasketText.getText();
            String expectedMessage = "Sepete Eklendi" ;
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        }
        return this ;

    }
}

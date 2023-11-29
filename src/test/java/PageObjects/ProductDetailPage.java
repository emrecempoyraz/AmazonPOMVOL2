package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailPage extends BasePage {


    @FindBy(xpath = "//span[@id='productTitle']")
    private WebElement buyNowButton ;

    @FindBy(css = "input#add-to-cart-button")
    private WebElement addToCartButton ;

    @FindBy(className = "a-size-medium-plus a-color-base sw-atc-text a-text-bold")
    private WebElement addedToBasketText ;


    public ProductDetailPage validateIsOnProductPage () {
        waitForElement(buyNowButton);
        String actualTitle = buyNowButton.getText();
        String expectedTitle = "JBL Tune 510BT: Purebass Sound ile Kablosuz Kulak Üstü Kulaklık - Mavi, Orta";
        Assert.assertEquals(actualTitle,expectedTitle);
        return this ;
    }

    public ProductDetailPage addToCartProduct () {
        if (addToCartButton.isDisplayed())
            addToCartButton.click();
        return this ;
    }



    public BasketPage basketPage () {
        return new BasketPage () ;
    }
}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[4]")
    private WebElement brandFilter ;

    @FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[72]")
    private WebElement bluetoothFilter ;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    private WebElement productLocator ;

    public ProductsPage filterBrand () {
        if (brandFilter.isDisplayed()){
            brandFilter.click();
        }

        return this ;
    }

    public ProductsPage filterBluetooth () {
        waitForElement(bluetoothFilter);
        bluetoothFilter.click();
        return this ;
    }

    public ProductsPage selectProduct () {
        waitForElement(productLocator);
        productLocator.click();
        return this ;
    }

    public ProductDetailPage productDetailPage () {
        return new ProductDetailPage () ;
    }
}

package PageObjects;


import Parameters.IParams;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy (css = "#twotabsearchtextbox")
    private WebElement searchBar ;

    @FindBy (css = "#nav-search-submit-button")
    private WebElement searchIcon ;

    @FindBy(css = "#sp-cc-accept")
    private WebElement cookies ;




    public HomePage acceptCookies () {
        cookies.click();
        return this ;
    }

    public HomePage searchProduct () {
      searchBar.click();
      searchBar.clear();
      searchBar.sendKeys((IParams.PRODUCT) + Keys.ENTER);
      return this ;
    }



    //(//input[@type='checkbox'])[4]

    public ProductsPage productsPage () {
        return new ProductsPage();
    }


}

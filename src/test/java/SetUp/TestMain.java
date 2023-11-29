package SetUp;

import PageObjects.BasketPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestMain extends BaseTest{



    @Description("AMAZON_E2E_V2_POM")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "e2e")
    public void orderProductFromScratch () {
        startTest
                .acceptCookies()
                .searchProduct()
                .productsPage()
                .filterBrand()
                .filterBluetooth()
                .selectProduct()
                .productDetailPage()
                .validateIsOnProductPage()
                .addToCartProduct()
                .basketPage()
                .validateIsProductAddedToCart();


    }
}

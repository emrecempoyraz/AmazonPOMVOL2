package SetUp;

import PageObjects.HomePage;
import Test.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver ;
    public static HomePage startTest ;

    @BeforeTest
    public void setUp () {
        driver = DriverSetup.initDriver();
        startTest = new HomePage();
    }

    /*@AfterTest
    public void tearDown () {
        if (driver != null) {
            driver.close();
        }
    }*/
}

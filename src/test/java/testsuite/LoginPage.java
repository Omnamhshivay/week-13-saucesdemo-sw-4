package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Products;
import testbase.TestBase;
import utility.Utility;

import java.util.List;

public class LoginPage extends TestBase {
    HomePage homepage = new HomePage();
    Products products =new Products();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homepage.enterUserName("standard_user");
        homepage.enterPassword("secret_sauce");
        homepage.clickOnLoginButton();
        String actualMessage= products.verifyText();
        String expectedMessage ="PRODUCTS";
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
    public void verifyThatSixProductsAreDisplyedOnPage(){
        homepage.enterUserName("standard_user");
        homepage.enterPassword("secret_sauce");
        homepage.clickOnLoginButton();
        int actualNumber =products.verifyProductList();
        int expectednumber=6;
        Assert.assertEquals(expectednumber,actualNumber);

    }


}

package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.util.List;

public class Products extends Utility {
    By userField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productsText = By.className("title");
    By productList = By.xpath("//div[@class='inventory_item']");

    public void enterUserName(String uName){
        sendTextToElement(userField,uName);}

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);}

    public void clickOnLoginButton(){
        clickOnElement(loginButton);}

    public String verifyText(){
        return getTextFromElement(productsText);}

    public int verifyProductList(){
        List<WebElement> number= driver.findElements(productList);
        return  number.size();


    }
}

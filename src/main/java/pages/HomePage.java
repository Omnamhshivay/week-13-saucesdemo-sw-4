package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class HomePage extends Utility {
    By userField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public void enterUserName(String uName){
        sendTextToElement(userField,uName);}

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);}
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}

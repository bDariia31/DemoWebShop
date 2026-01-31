package de.demowebshop.fw;

import de.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper
{
    protected WebDriver driver;

    public UserHelper(WebDriver driver) {
        super(driver);

    }

    public String newEmail()
    {
        int i=(int)((System.currentTimeMillis()/1000)%3600);
        String email="karl"+i+"@gmail.com";
        return email;
    }

    public boolean isLogOutInHeaderPresent() {
        return isElementPresent(By.xpath("//a[@class='ico-logout']"));
    }

    public void clickOnRegisterButton() {
        click(By.xpath("//input[@id='register-button']"));
    }

    public void clickOnTheRegisterLink() {
        click(By.xpath("//a[@class='ico-register']"));
    }

    public void fillRegisterForm(String name, String lastname, String email, String password) {
        type(By.name("FirstName"), name);
        //3
        type(By.name("LastName"), lastname);
        //4
        type(By.name("Email"), email);
        // type(By.name("Email"), newEmail()); // newEmail- метод в Testbase, который создает каждый раз новый email для регистрации
        //5
        type(By.name("Password"), password);
        //6
        type(By.name("ConfirmPassword"), password);
    }

    public void clickOnLoginButton() {
        click(By.cssSelector(".login-button"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.name("Email"), email);
        type(By.name("Password"), password);
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isLogOutButtonPresent()
    {
        return isElementPresent(By.xpath("//*[@class='ico-logout']"));
    }

    //---

    public boolean isLoginLinkPresent()
    {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }


    public void isClickOnLoginButton()
    {
        click(By.cssSelector(".login-button"));
    }


    public void isClickOnLogOutButton()
    {
        click(By.xpath("//a[@class='ico-logout']"));
    }


}

package de.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase
{
     @Test
    public void LoginPositiveTest()
     {
         click(By.cssSelector(".ico-login"));
         type(By.name("Email"), "dariiatest1@gmail.com");
         //type(By.name("Email"), newEmail()); // newEmail- метод в Testbase, который создает каждый раз новый email для регистрации
         type(By.name("Password"), "Test123$");
         click(By.xpath("//*[@class='button-1 login-button']"));
         Assert.assertTrue(isLogOutButtonPresent());

     }

    public boolean isLogOutButtonPresent()
    {
        return isElementPresent(By.xpath("//*[@class='ico-logout']"));
    }



}

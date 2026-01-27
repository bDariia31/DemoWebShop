package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase
{
     @Test
    public void LoginPositiveTest()
     {
         app.getUser().click(By.cssSelector(".ico-login"));
         app.getUser().fillLoginForm("dariiatest1@gmail.com", "Test123$");
         app.getUser(). click(By.xpath("//*[@class='button-1 login-button']"));
         Assert.assertTrue(app.getUser().isLogOutButtonPresent());

     }


}

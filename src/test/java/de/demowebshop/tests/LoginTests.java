package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import de.demowebshop.data.UserData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase
{
    @BeforeMethod
    public void ensurePrecondition()
    {

        if (!app.getUser().isLoginLinkPresent())
        {
            app.getUser().isClickOnLogOutButton();
        }

//        if (!app.getUser().isLoginLinkPresent())
//        {
//            app.getUser().isClickOnLoginButton();
//        }
    }

     @Test
    public void LoginPositiveTest()
     {
         app.getUser().click(By.cssSelector(".ico-login"));
         app.getUser().fillLoginForm(UserData.EMAIL, UserData.PASSWORD);
         app.getUser(). click(By.xpath("//*[@class='button-1 login-button']"));
         Assert.assertTrue(app.getUser().isLogOutButtonPresent());

     }


}

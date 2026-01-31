package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import de.demowebshop.data.UserData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase
{
    @BeforeMethod
    public void preconditions()
    {

        if (!app.getUser().isLoginLinkPresent())
        {
            app.getUser().isClickOnLogOutButton();
        }

//        if (!app.getUser().isLoginLinkPresent())
//        {
//            app.getUser().isClickOnLoginLink();
//        }

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(UserData.EMAIL, UserData.PASSWORD);
        app.getUser().clickOnLoginButton();

    }

    @Test
    public void addItemToCartTest()
    {
       String name= app.getItem().itemName("3");
        app.getItem().clickOnItemInList("3");
        app.getItem().clickOnShoppingCartLink();
        Assert.assertTrue(app.getItem().verifyByItem(name));

    }


//    @AfterMethod
//    public void postconditions()
//    {
//        removeItemFromCart();
//    }
//
//    private void removeItemFromCart()
//    {
//        click(By.ByName())
//    }


}

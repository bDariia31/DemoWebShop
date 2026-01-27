package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase
{
    @BeforeMethod
    public void preconditions()
    {

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm("dariiatest1@gmail.com", "Test123$");
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

//
//    @AfterMethod
//    public void postconditions()
//    {
//        removeItemFromCart();
//    }
//


}

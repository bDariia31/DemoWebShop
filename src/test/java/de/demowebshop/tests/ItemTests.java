package de.demowebshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ItemTests extends TestBase
{
    @BeforeMethod
    public void preconditions()
    {
        click(By.cssSelector(".ico-login"));
        type(By.name("Email"), "dariiatest1@gmail.com");
        type(By.name("Password"), "Test123$");
        click(By.xpath("//*[@class='button-1 login-button']"));

    }

    @Test
    public void addItemToCartTest()
    {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
        click(By.xpath("//*[@class='cart-label']"));
        Assert.assertTrue(verifyByItem("14.1-inch Laptop"));

    }


   public boolean verifyByItem(String text)
   {
       List<WebElement> items = driver.findElements(By.xpath("//a[@class='product-name']"));
       for(WebElement element:items)
       {
           if(element.getText().contains(text))
               return  true;
       }
       return false;
   }
}

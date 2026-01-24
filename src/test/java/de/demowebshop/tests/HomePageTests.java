package de.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase
{

    @Test
    public void isHomePageWelcomePresentTest()
    {
        //driver.findElement(By.xpath("//div[@class='topic-html-content-title']/h2"));
        Assert.assertTrue(isHomePageWelcomePresent());
    }

}

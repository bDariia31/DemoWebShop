package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase
{

    @Test
    public void isHomePageWelcomePresentTest()
    {
        //driver.findElement(By.xpath("//div[@class='topic-html-content-title']/h2"));
        Assert.assertTrue(app.getHomePage().isHomePageWelcomePresent());
    }

}


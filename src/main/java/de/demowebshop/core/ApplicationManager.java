package de.demowebshop.core;

import de.demowebshop.fw.HomePageHelper;
import de.demowebshop.fw.ItemHelper;
import de.demowebshop.fw.UserHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
    protected WebDriver driver;

UserHelper user;
ItemHelper item;
HomePageHelper homePage;

    public void init() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user=new UserHelper(driver);
        item= new ItemHelper(driver);
        homePage=new HomePageHelper(driver);

    }

    public UserHelper getUser() {
        return user;
    }

    public ItemHelper getItem() {
        return item;
    }

    public HomePageHelper getHomePage() {
        return homePage;
    }

    public void stop() {
        if(driver!=null)
        {
            driver.quit();
        }
    }


}

package de.demowebshop.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase // родительский класс
{
  protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
  Logger logger= LoggerFactory.getLogger(TestBase.class);

    protected WebDriver driver;

    @BeforeSuite
    public void setUp()
    {
        app.init();

    }

    @AfterSuite(enabled = true)
    public void tearDown()
    {
        app.stop();
    }


    @BeforeMethod
    public void startTest(Method method,Object[] p)
    {
        logger.info("Start test {}",method.getName());
    }

    @AfterMethod
    public void stopTest(ITestResult result)
    {
        if(result.isSuccess())
        {
            logger.info("PASSED:{}",result.getMethod().getMethodName());

        }else
        {
            logger.error("Falled:{}.Screenshot ->{}",result.getMethod().getMethodName(),app.getUser());
        }
        logger.info("Stop test");
        logger.info("-----------------------------------------------------------------------");

    }




}

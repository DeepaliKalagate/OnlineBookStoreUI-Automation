package com.onlinebookstore.base;

import com.onlinebookstore.constantpaths.IAutoConstants;
import com.onlinebookstore.properties.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class Browser implements IAutoConstants
{
    public static WebDriver driver;
    public static Logger logger=Logger.getLogger(Browser.class);

    @BeforeMethod
    public static void initiation() throws InterruptedException
    {
        System.setProperty(CHROMEKEY,CHROMEVALUE);
        if(browser.equals("chrome"))
        {
            WebDriverManager.chromedriver();
            driver = new ChromeDriver();

        }
        else
        {
            WebDriverManager.firefoxdriver();
            driver = new FirefoxDriver();
        }
        logger.info("*****URL Loading starting");
        String url=Library.getProperty(CONFIGPATH,"URL");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);

        logger.warn("*****Warning message****");
        logger.error("******Error is There****");

        logger.debug("****Debugginfo******" );


        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
        logger.info("****Driver Close******");
    }
}

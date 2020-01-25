package com.onlinebookstore.page;

import com.onlinebookstore.base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends Browser
{

    @FindBy(xpath="//div[6]//div[1]//div[1]//button[1]")
    private WebElement Book6;


    @FindBy(xpath="//div[15]//div[1]//div[1]//button[1]")
    private WebElement Book15;

    @FindBy(xpath="//div[51]//div[1]//div[1]//button[1]")
    private WebElement Book51;

    @FindBy(xpath="//div[27]//div[1]//div[1]//button[1]")
    private WebElement Book27;

    //initialization
    public Dashboard(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //utilization
    public void clickAddToBag() throws InterruptedException
    {
        Book6.click();
        Thread.sleep(4000);
        Book15.click();
        Thread.sleep(4000);
        Book51.click();
        Thread.sleep(4000);
        Book27.click();
        Thread.sleep(4000);
    }
}

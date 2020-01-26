package com.onlinebookstore.page;

import com.onlinebookstore.base.Browser;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends Browser
{

    @FindBy(xpath="//div[6]//div[1]//div[1]//button[1]")
    private WebElement book6;


    @FindBy(xpath="//div[8]//div[1]//div[1]//button[1]")
    private WebElement book8;

    @FindBy(xpath="//div[4]//div[1]//div[1]//button[1]")
    private WebElement book4;


    @FindBy(xpath="//div[15]//div[1]//div[1]//button[1]")
    private WebElement book15;

    @FindBy(xpath = "//*[@class='MuiSvgIcon-root iconButton']")
    private WebElement addToCart;

    //initialization
    public Dashboard(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //utilization
    public void clickAddToBag() throws InterruptedException
    {
        book4.click();
        Thread.sleep(2000);
        book6.click();
        Thread.sleep(2000);
        book8.click();
        Thread.sleep(2000);
        book15.click();
        Thread.sleep(2000);
    }
    public void clickOnAddToCart() throws InterruptedException
    {
        addToCart.click();
        Thread.sleep(4000);
    }
}

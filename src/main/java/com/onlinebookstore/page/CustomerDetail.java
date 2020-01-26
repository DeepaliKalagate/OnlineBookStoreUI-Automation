package com.onlinebookstore.page;

import com.onlinebookstore.base.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerDetail extends Browser {
    @FindBy(xpath = "//span[contains(text(),'PLACED ORDER')]")
    private WebElement placeOrder;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement name;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    private WebElement phoneNumber;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    private WebElement pinCode;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    private WebElement locality;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    private WebElement address;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    private WebElement city;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    private WebElement landmark;

    @FindBy(xpath = "//li[contains(text(),'INDIA')]")
    private WebElement india;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/ul[1]/li[2]")
    private WebElement other;

    @FindBy(xpath = "//span[contains(text(),'CONTINUE')]")
    private WebElement continueButton;

    public CustomerDetail(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickPlaceOrder()
    {
        placeOrder.click();
    }

    public void setName()
    {
        name.sendKeys("Deepali");
    }

    public void setPhoneNumber()
    {
        phoneNumber.sendKeys("84989861");
    }

    public void setPinCode()
    {
        pinCode.sendKeys("421201");
    }

    public void setLocality()
    {
        locality.sendKeys("Ramnagar");
    }

    public void setAddress()
    {
        address.sendKeys("Shiv Om Shakti CHS Ltd");
    }

    public void setCity()
    {
        city.sendKeys("Dombivli");
    }

    public void setLandmark()
    {
        landmark.sendKeys("Shiv Mandir Road");
    }

    public void setIndia()
    {
        india.click();
    }

    public void setContinueButton()
    {
        continueButton.click();
    }
}

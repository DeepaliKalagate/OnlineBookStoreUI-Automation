package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import com.onlinebookstore.page.Dashboard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AddToCartTest extends Browser
{
    @Test
    public void givenOnlineBookstore_WhenClickOnAddToCart_ThenListOfSelectedBooksShouldDisplay() throws InterruptedException {

        logger.info("**Add to cart test start**");
        Dashboard dashboard = new Dashboard(driver);
        Thread.sleep(4000);
        dashboard.clickAddToBag();
        Thread.sleep(4000);
        dashboard.clickOnAddToCart();
        Thread.sleep(5000);
        logger.info("**Add to cart test end**");
    }
}

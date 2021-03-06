package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import com.onlinebookstore.page.Dashboard;
import org.testng.annotations.Test;

public class SelectBookTest extends Browser {
    @Test
    public void givenOnlineBookstore_WhenClickBooks_ThenBookShouldGetSelected() throws InterruptedException {
        logger.info("**Select book test start**");
        Dashboard dashboard = new Dashboard(driver);
        Thread.sleep(4000);
        dashboard.clickAddToBag();
        Thread.sleep(4000);
        logger.info("**Select book test end**");
    }
}


package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import com.onlinebookstore.page.CustomerDetail;
import com.onlinebookstore.page.Dashboard;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CustomerDetailsTest extends Browser {

    @Test
    public void gievnListBooks_WhenCustomerPlacedOrder_ThenShouldPlaceOrderSuccessfully() throws InterruptedException {
        logger.info("Customer Details Test Start");
        CustomerDetail customerDetail=new CustomerDetail(driver);
        Dashboard dashboard=new Dashboard(driver);
        Thread.sleep(4000);
        dashboard.clickAddToBag();
        Thread.sleep(4000);
        dashboard.clickOnAddToCart();
        Thread.sleep(5000);
        customerDetail.clickPlaceOrder();
        Thread.sleep(2000);
        customerDetail.setName();
        Thread.sleep(2000);
        customerDetail.setPhoneNumber();
        Thread.sleep(2000);
        customerDetail.setPinCode();
        Thread.sleep(2000);
        customerDetail.setLocality();
        Thread.sleep(2000);
        customerDetail.setAddress();
        Thread.sleep(2000);
        customerDetail.setCity();
        Thread.sleep(2000);
        customerDetail.setLandmark();
        Thread.sleep(2000);
        customerDetail.setIndia();
        Thread.sleep(2000);
        customerDetail.setContinueButton();
        logger.info("Customer Details Test End");
    }
}

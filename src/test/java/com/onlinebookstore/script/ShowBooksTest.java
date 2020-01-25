package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ShowBooksTest extends Browser
{
    @Test
    public void givenURL_WhenExecute_ThenShouldShowTheHomePage() throws InterruptedException
    {
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);
    }
}

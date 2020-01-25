package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import org.testng.annotations.Test;

public class DashbordTest extends Browser
{
    @Test
    public void givenURL_WhenExecute_ThenShouldDisplayDashboard()
    {
        logger.info("**Dashboard test start**");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        logger.info("**Dashboard test end**");
    }
}

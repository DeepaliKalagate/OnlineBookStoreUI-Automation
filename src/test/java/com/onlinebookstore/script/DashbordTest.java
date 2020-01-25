package com.onlinebookstore.script;

import com.onlinebookstore.base.Browser;
import org.testng.annotations.Test;

public class DashbordTest extends Browser
{
    @Test
    public void givenURL_WhenExecute_ThenShouldDisplayDashboard()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

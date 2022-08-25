package com.educationalDomain.wipro.Scripts;

import com.edcationalDomain.wipro.genericLibraries.BaseClass;
import com.educationalDomain.wipro.POMpages.ContactUsPage;
import com.educationalDomain.wipro.POMpages.LoginPage;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase2 extends BaseClass
{
    @Test(dataProvider = "readExcelData")
    public void tc2(String name, String email, String subject, String message) throws IOException, InterruptedException
    {
        test=reports.createTest("tc2");
        LoginPage l=new LoginPage(driver);
        ContactUsPage c = l.contactus(driver);
        Thread.sleep(3000);
        c.sendDetails(name,email,subject,message);
    }
}

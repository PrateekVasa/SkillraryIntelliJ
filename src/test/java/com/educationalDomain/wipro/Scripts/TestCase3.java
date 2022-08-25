package com.educationalDomain.wipro.Scripts;

import com.edcationalDomain.wipro.genericLibraries.BaseClass;
import com.educationalDomain.wipro.POMpages.CoreJavaPage;
import com.educationalDomain.wipro.POMpages.LoginPage;
import com.educationalDomain.wipro.POMpages.WishlistPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase3 extends BaseClass
{
    @Test
    public void tc3() throws IOException {
        test=reports.createTest("tc3");
        LoginPage l=new LoginPage(driver);
        CoreJavaPage c = l.searchcourse(driver, fu.getPropertyFile("cn"));
        WishlistPage w = c.corejavaselenium(driver);
        w.getAcceptbtn().click();
        utilities.switchframe(driver);
        w.playpause();
        utilities.switchbackfromframe(driver);
        w.getAddtowishlist().click();

    }
}

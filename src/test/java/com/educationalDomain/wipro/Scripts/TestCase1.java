package com.educationalDomain.wipro.Scripts;

import com.edcationalDomain.wipro.genericLibraries.BaseClass;
import com.educationalDomain.wipro.POMpages.AddtoCartPage;
import com.educationalDomain.wipro.POMpages.LoginPage;
import com.educationalDomain.wipro.POMpages.SkillraryDemoLoginPage;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass
{
    @Test
    public void tc1()
    {
        LoginPage l=new LoginPage(driver);
        SkillraryDemoLoginPage s = l.demoApp(driver);
        utilities.switchTabs(driver);
        utilities.mouseHover(driver,s.getCoursebtn());
        AddtoCartPage cart = s.course(driver);
        utilities.doubleclick(driver, cart.getAddbtn());
        cart.getAddtocartbtn().click();
        utilities.alertpopupok(driver);
    }
}

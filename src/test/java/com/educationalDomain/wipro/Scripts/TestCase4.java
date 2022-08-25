package com.educationalDomain.wipro.Scripts;

import com.edcationalDomain.wipro.genericLibraries.BaseClass;
import com.educationalDomain.wipro.POMpages.LoginPage;
import com.educationalDomain.wipro.POMpages.SkillraryDemoLoginPage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestCase4 extends BaseClass
{
    @Test
    public void tc4() throws IOException, SQLException {
        test=reports.createTest("tc4");
        LoginPage l=new LoginPage(driver);
        SkillraryDemoLoginPage s = l.demoApp(driver);
        utilities.switchTabs(driver);
        utilities.dropdown(s.getDropdown(),fu.getPropertyFile("dropdown"));
        s.testing(driver);
        fu.queryExecution("select * from verification",1,"INR 19.00");
    }
}

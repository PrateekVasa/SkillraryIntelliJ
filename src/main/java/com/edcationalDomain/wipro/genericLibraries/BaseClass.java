package com.edcationalDomain.wipro.genericLibraries;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class BaseClass extends FileUtilities
{
    public WebDriver driver;
    public ExtentHtmlReporter htmlreport;
    public static ExtentReports reports;
    public static ExtentTest test;
    public WebDriverUtilities utilities=new WebDriverUtilities();
    public FileUtilities fu=new FileUtilities();
    public static Connection con;

    @BeforeSuite
    public void configBS() throws SQLException
    {
        con=fu.getDataFromDB();

        htmlreport=new ExtentHtmlReporter(AutoConstant.reportpath);
        htmlreport.config().setDocumentTitle("SkillraryReport");
        htmlreport.config().setTheme(Theme.DARK);
        reports=new ExtentReports();
        reports.attachReporter(htmlreport);
    }
    @BeforeMethod
    public void openApp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(fu.getPropertyFile("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeApp(ITestResult res) throws IOException
    {
        int result = res.getStatus();
        if (result==ITestResult.FAILURE)
        {
            test.log(Status.FAIL, res.getName()+"Test case is failed");
            test.log(Status.FAIL, res.getThrowable()+"Test case is failed");
        } else if (result==ITestResult.SUCCESS)
        {
            test.log(Status.PASS, res.getName()+"Test case is passed");
        } else if (result==ITestResult.SKIP)
        {
            test.log(Status.SKIP, res.getName()+"Test case is skipped");
        }
        String name = res.getName();
        if (result==2)
        {
            Photo p=new Photo();
            p.screenshot(driver, name);
        }
        driver.quit();
    }
    @AfterSuite
    public void configAS() throws SQLException
    {
        htmlreport.flush();
        reports.flush();

        fu.closeDB();
    }
}

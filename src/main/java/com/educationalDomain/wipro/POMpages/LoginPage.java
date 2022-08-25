package com.educationalDomain.wipro.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    @FindBy(xpath = "//a[text()=' GEARS ']")
    private WebElement gearsbtn;

    @FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement skillrarydemoapp;

    @FindBy(xpath = "//a[text()=' Contact Us ']")
    private WebElement contactusbtn;

    @FindBy(name = "q")
    private WebElement searchbox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchbtn;

    public WebElement getGearsbtn() {
        return gearsbtn;
    }

    public WebElement getContactusbtn() {
        return contactusbtn;
    }

    public WebElement getSkillrarydemoapp() {
        return skillrarydemoapp;
    }

    public WebElement getSearchbox() {
        return searchbox;
    }

    public WebElement getSearchbtn() {
        return searchbtn;
    }

    public LoginPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public SkillraryDemoLoginPage demoApp(WebDriver driver)
    {
        gearsbtn.click();
        skillrarydemoapp.click();
        return new SkillraryDemoLoginPage(driver);
    }
    public ContactUsPage contactus(WebDriver driver)
    {
        contactusbtn.click();
        return new ContactUsPage(driver);
    }
    public CoreJavaPage searchcourse(WebDriver driver,String coursename)
    {
        searchbox.sendKeys(coursename);
        searchbtn.click();
        return new CoreJavaPage(driver);
    }
}

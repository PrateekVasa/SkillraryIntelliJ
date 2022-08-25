package com.educationalDomain.wipro.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage
{
    @FindBy(xpath = "//a[text()='COURSE']")
    private WebElement coursebtn;

    @FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
    private WebElement seleniumtraining;

    @FindBy(name = "addresstype")
    private WebElement dropdown;

    public WebElement getCoursebtn() {
        return coursebtn;
    }

    public WebElement getDropdown() {
        return dropdown;
    }

    public WebElement getSeleniumtraining() {
        return seleniumtraining;
    }
    public SkillraryDemoLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public AddtoCartPage course(WebDriver driver)
    {
        seleniumtraining.click();
        return new AddtoCartPage(driver);
    }
    public TestingPage testing(WebDriver driver)
    {
        return new TestingPage(driver);
    }
}

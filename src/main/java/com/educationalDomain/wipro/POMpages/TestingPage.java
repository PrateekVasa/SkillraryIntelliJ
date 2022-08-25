package com.educationalDomain.wipro.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{
    @FindBy(xpath = "(//a[text()='munit testing '])[2]")
    private WebElement munit;

    public WebElement getMunit() {
        return munit;
    }
    public TestingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}

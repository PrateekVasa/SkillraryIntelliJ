package com.educationalDomain.wipro.POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage
{
    @FindBy(xpath = "//button[text()='Accept']")
    private WebElement acceptbtn;

    @FindBy(xpath = "//div[@class='play-icon']")
    private WebElement playbtn;

    @FindBy(xpath = "//div[@class='pause-icon']")
    private WebElement pausebtn;

    @FindBy(xpath = "//span[text()='Add To Wishlist']")
    private WebElement addtowishlist;
    public WebElement getAcceptbtn() {
        return acceptbtn;
    }

    public WebElement getPlaybtn() {
        return playbtn;
    }

    public WebElement getPausebtn() {
        return pausebtn;
    }

    public WebElement getAddtowishlist() {
        return addtowishlist;
    }

    public WishlistPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void playpause()
    {
        playbtn.click();
        pausebtn.click();
    }
}

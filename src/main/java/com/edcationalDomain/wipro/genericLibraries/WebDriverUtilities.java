package com.edcationalDomain.wipro.genericLibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class WebDriverUtilities
{
    public void dropdown(WebElement ele,String text)
    {
        Select s=new Select(ele);
        s.selectByVisibleText(text);
    }
    public void mouseHover(WebDriver driver,WebElement ele)
    {
        Actions a=new Actions(driver);
        a.moveToElement(ele).perform();
    }
    public void rightclick(WebDriver driver,WebElement ele)
    {
        Actions a=new Actions(driver);
        a.contextClick(ele).perform();
    }
    public void doubleclick(WebDriver driver,WebElement ele)
    {
        Actions a=new Actions(driver);
        a.doubleClick(ele).perform();
    }
    public void draganddrop(WebDriver driver,WebElement src,WebElement dest)
    {
        Actions a=new Actions(driver);
        a.dragAndDrop(src,dest).perform();
    }
    public void switchframe(WebDriver driver)
    {
        driver.switchTo().frame(0);
    }
    public void switchbackfromframe(WebDriver driver)
    {
        driver.switchTo().defaultContent();
    }
    public void switchTabs(WebDriver driver)
    {
        Set<String> tab = driver.getWindowHandles();
        for(String b:tab)
        {
            driver.switchTo().window(b);
        }
    }
    public void alertpopupok(WebDriver driver)
    {
        driver.switchTo().alert().accept();
    }
    public void alertpopupcancel(WebDriver driver)
    {
        driver.switchTo().alert().dismiss();
    }
    public void scrollbar(WebDriver driver,int x,int y)
    {
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }
}

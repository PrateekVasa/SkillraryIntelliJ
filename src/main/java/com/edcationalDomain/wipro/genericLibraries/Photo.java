package com.edcationalDomain.wipro.genericLibraries;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author Prateek
 */
public class Photo
{
    /**
     * It is used to take the screenshot of the failed test cases
     * @param driver
     * @param name
     * @return
     * @throws IOException
     */
    public String screenshot(WebDriver driver,String name) throws IOException {
        Date d=new Date();
        String date = d.toString().replaceAll(":", "-");

        TakesScreenshot ts= (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest=new File(AutoConstant.photopath+date+name+".png");
        FileUtils.copyFile(src,dest);
        return date;
    }
}

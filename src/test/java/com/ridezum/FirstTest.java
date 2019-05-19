package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest{



    @Test
    public void testFirst(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ridezum.com/");
        String titleExpected = "Zūm | Rides for Kids, After School Care";
        String titleActual = driver.getTitle();
        Assert.assertTrue(titleExpected.equals(titleActual));

    }


}

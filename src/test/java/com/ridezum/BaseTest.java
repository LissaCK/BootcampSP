package com.ridezum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ridezum.com/");

    }
    @After

    public void close() {

    }




}

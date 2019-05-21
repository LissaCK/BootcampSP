package com.ridezum;

import com.ridezum.helper.UserDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected UserDriver userDriver;

    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/lesya/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ridezum.com");
        userDriver = new UserDriver();

    }
    @After

    public void close() {

    }




}

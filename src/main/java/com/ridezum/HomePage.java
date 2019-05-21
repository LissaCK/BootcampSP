package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".main-menu__link")
    private List<WebElement> beginDriverButton;

    @FindBy(css = ".main-menu__link")
    private  List<WebElement> careersButton;


    public BeginDriverPage clickBeginDriver(){
    wait.until(ExpectedConditions.elementToBeClickable(beginDriverButton.get(2)));
    beginDriverButton.get(2).click();
    return new BeginDriverPage(driver);


    }

    public CareersPage clickCareersButton(){
        wait.until(ExpectedConditions.elementToBeClickable(careersButton.get(4)));
        careersButton.get(4).click();
        return new CareersPage(driver);
    }
}




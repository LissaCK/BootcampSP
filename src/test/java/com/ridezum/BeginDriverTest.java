package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class BeginDriverTest extends BaseTest{
    private HomePage homePage;
    private BeginDriverPage beginDriverPage;

@Test
    public void testBeginDriver(){

    homePage = new HomePage(driver);

    beginDriverPage = homePage.clickBeginDriver();
    driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));



    beginDriverPage.inputFirstNameField(userDriver.getFirstName());
    beginDriverPage.inputLastNameField(userDriver.getLastName());
    beginDriverPage.inputEmailField(userDriver.getEmail());
    beginDriverPage.inputPhoneField(userDriver.getPhone());
    beginDriverPage.selectRegion();
    beginDriverPage.inputZipcodeField(userDriver.getZipcode());
    beginDriverPage.inputReferralCode(userDriver.getReferralCode());

    //swtch out from iframe

    //driver.switchTo().defaultContent();

    //String res = beginDriverPage.clickSubmitButton();
    //Assert.assertEquals("Submit", res);
    String error = beginDriverPage.getPhoneNumberError();
    Assert.assertEquals("The phone number is not valid", error);



}



}

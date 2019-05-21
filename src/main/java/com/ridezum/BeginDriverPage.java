package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BeginDriverPage extends BasePage {
public BeginDriverPage(WebDriver driver){
    super(driver);
}


    @FindBy(css = ".form-control")
    private List<WebElement> firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionSelectButton;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipcodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement referralCodeField;

    @FindBy(css = "btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
   private List<WebElement> phoneNumberError;


    public void clickFirstNameField() {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField.get(0)));
        firstNameField.get(0).getText();
    }



    public void inputFirstNameField(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField.get(0)));
        firstNameField.get(0).sendKeys(firstName);
    }

    public void inputLastNameField(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPhoneField(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }


    public void selectRegion(){
        wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));
        Select select = new Select(regionSelectButton);
        select.selectByIndex(2);

    }

    public void inputZipcodeField(String zipcode){
        wait.until(ExpectedConditions.elementToBeClickable(zipcodeField));
        zipcodeField.sendKeys(zipcode);
    }

    public void inputReferralCode(String referral){
        wait.until(ExpectedConditions.elementToBeClickable(referralCodeField));
        referralCodeField.sendKeys(referral);
    }

    public String clickSubmitButton(){
        wait.until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
        String res = submitButton.getText();
        return res;

    }

    public String getPhoneNumberError(){
        wait.until(ExpectedConditions.visibilityOf(phoneNumberError.get(6)));
        String error = phoneNumberError.get(6).getText();
        return error;

    }



}

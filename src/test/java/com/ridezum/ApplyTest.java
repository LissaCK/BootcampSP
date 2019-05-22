package com.ridezum;

import org.junit.Test;

public class ApplyTest extends BaseTest {
    private HomePage homePage;
    private CareersPage careersPage;
    private ViewJobsPage viewJobsPage;
    private ApplyPRPage applyPRPage;
    private ApplyPage applyPage;


    @Test
    public void testApply(){
        homePage = new HomePage(driver);
       careersPage = homePage.clickCareersButton();
       viewJobsPage = careersPage.clickViewJobsButton();
       applyPRPage = viewJobsPage.clickApplyPRButton();


    }


}

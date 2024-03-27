package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Contains test cases related to the Login page functionality.
 */
public class LoginPageTest extends BaseTest {

    @Test
    public void verifyUserIsNavigateToTheLoginPage() {
        LoginPage loginPage = new LoginPage(page);
        Assert.assertEquals(page.url(), loginPage.getLoginPageURL());
    }
}

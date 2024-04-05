package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.DashboardPage;
import com.opencart.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

/**
 * Contains test cases related to the Login page functionality.
 *
 * @Bhavin.Thumar
 */
public class LoginPageTest extends BaseTest {

    @Test
    public void verifyUserIsNavigateToTheLoginPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(page);
        assertThat(page).hasURL(loginPage.getLoginPageURL());
        loginPage.doLogin();
        Thread.sleep(15000);
        assertThat(page).hasTitle("Dashboard");
    }
}

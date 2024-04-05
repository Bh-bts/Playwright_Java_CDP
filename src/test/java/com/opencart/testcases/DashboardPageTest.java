package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.DashboardPage;
import com.opencart.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class DashboardPageTest extends BaseTest {

    @Test
    public void verifyUserIsNavigateToTheDashboardPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(page);
        assertThat(page).hasURL(loginPage.getLoginPageURL());
        loginPage.doLogin();
        Thread.sleep(15000);
        assertThat(page).hasTitle("Dashboard");
    }
}

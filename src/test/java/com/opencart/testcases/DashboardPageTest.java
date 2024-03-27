package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.DashboardPage;
import com.opencart.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends BaseTest {

    @Test
    public void verifyUserIsNavigateToTheDashboardPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(page);
        DashboardPage dashboardPage = new DashboardPage(page);
        loginPage.doLogin();
        Assert.assertEquals(page.url(), dashboardPage.getDashboardPageUrl());
        Thread.sleep(5000);
    }
}

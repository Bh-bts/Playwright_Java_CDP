package com.opencart.testcases;

import com.opencart.pages.BaseTest;
import com.opencart.pages.LoginPage;
import org.testng.annotations.Test;

public class MarketplacePageTest extends BaseTest {

    @Test
    public void verifyUserIsNavigateToTheDashboardPage() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.doLogin();
    }
}

package com.opencart.pages;

import com.microsoft.playwright.Page;
import com.opencart.utils.PropertiesUtils;

public class DashboardPage {

    Page page;
    PropertiesUtils propertiesUtils;

    // String Locators - Object Repository
    private final String securityNotificationCloseButton = "button.btn-close";
    private final String extensionLink = "a[href='#collapse-2']";
    private final String marketPlaceLink = "ul[id='collapse-2'] > li:nth-child(1)";

    public DashboardPage(Page page) {
        this.page = page;
        this.propertiesUtils = new PropertiesUtils();
    }

    public String getDashboardPageUrl() {
        return "Dashboard";
    }

    public void navigateToMarketPlacePage() {
        page.click(securityNotificationCloseButton);
        page.click(extensionLink);
        page.click(marketPlaceLink);
    }
}

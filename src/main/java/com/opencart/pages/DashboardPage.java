package com.opencart.pages;

import com.microsoft.playwright.Page;

public class DashboardPage {

    Page page;

    // String Locators - Object Repository
    private final String securityNotificationCloseButton = "button.btn-close";
    private final String extensionLink = "a[href='#collapse-2']";
    private final String marketPlaceLink = "ul[id='collapse-2'] > li:nth-child(1)";

    public DashboardPage(Page page) {
        this.page = page;
    }

    public String getDashboardPageUrl() {
        return page.url();
    }

    public void navigateToMarketPlacePage() {
        page.click(securityNotificationCloseButton);
        page.click(extensionLink);
        page.click(marketPlaceLink);
    }
}

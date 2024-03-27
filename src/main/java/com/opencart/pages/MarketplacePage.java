package com.opencart.pages;

import com.microsoft.playwright.Page;

public class MarketplacePage {

    Page page;

    // String Locators - Object Repository
    private final String searchField = "filter_search";
    private final String searchResult = "div.row:nth-child(2) h4 a";

    public void searchExtension() {
        page.fill(searchField, "Paypal");
        page.textContent(searchResult);
    }

}

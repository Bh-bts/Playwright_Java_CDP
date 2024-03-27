package com.opencart.pages;

import com.microsoft.playwright.Page;

/**
 * Page class for Login Page functionalities.
 */
public class LoginPage {

    Page page;

    // String Locators - Object Repository
    private final String usernameField = "input[name=username]";
    private final String passwordField = "input[name=password]";
    private final String loginButton = "[type='submit']";

    /**
     * Constructs a LoginPage object with the provided Page instance.
     *
     * @param page The Playwright Page instance.
     */
    public LoginPage(Page page) {
        this.page = page;
    }

    /**
     * Retrieves the URL of the Login page.
     *
     * @return String representing the URL of the Login page.
     */
    public String getLoginPageURL() {
        return page.url();
    }

    public void doLogin() {
        page.fill(usernameField, "demo");
        page.fill(passwordField, "demo");
        page.click(loginButton);
    }
}

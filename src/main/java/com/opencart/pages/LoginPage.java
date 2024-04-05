package com.opencart.pages;

import com.microsoft.playwright.Page;
import com.opencart.utils.PropertiesUtils;

/**
 * Page class for Login Page functionalities.
 *
 * @Bhavin.Thumar
 */
public class LoginPage {

    Page page;
    PropertiesUtils propertiesUtils;

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
        this.propertiesUtils = new PropertiesUtils();
        this.page = page;
    }

    /**
     * Retrieves the URL of the Login page.
     *
     * @return String representing the URL of the Login page.
     */
    public String getLoginPageURL() {
        return propertiesUtils.setBaseURL();
    }

    public void doLogin() {
        page.fill(usernameField, "demo");
        page.fill(passwordField, "demo");
        page.click(loginButton);
    }
}

package com.opencart.base;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.opencart.browserFactory.Browsers;
import com.opencart.pages.ExtensionsPage;
import com.opencart.pages.LoginPage;
import com.opencart.utils.PropertiesUtils;
import com.opencart.utils.ScreenshotUtils;

/**
 * BaseTest class for test initialization and teardown.
 */
public class BaseTest {

    Browsers browsers;
    Page page;
    protected ExtensionsPage homePage;
    protected LoginPage loginPage;
    PropertiesUtils propertiesUtils;
    ScreenshotUtils screenshotUtils;

    /**
     * Initializes the test environment.
     *
     * @throws IOException if an I/O exception occurs
     */
    @BeforeTest
    public void setUP() throws IOException {
        browsers = new Browsers();
        page = browsers.startBrowser(
                propertiesUtils.setBrowser().trim(),
                propertiesUtils.setUrl().trim(),
                propertiesUtils.setHeadlessMode()
        );
        homePage = new ExtensionsPage(page);
    }

    /**
     * Tears down the test environment after test execution.
     */
    @AfterTest
    public void tearDown() {
        page.context().browser().close();
    }

    /**
     * Takes a screenshot in case of test failure.
     *
     * @param result The test result.
     * @throws IOException if an I/O exception occurs while capturing the screenshot
     */
    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            // Capture a screenshot and get the path
            String screenshotPath = screenshotUtils.captureScreenshot();
            System.out.println("Screenshot is generated for failure: " + result.getName() + " - Path: " + screenshotPath + '\n');
        }
    }
}

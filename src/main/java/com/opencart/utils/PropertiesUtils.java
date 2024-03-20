package com.opencart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Utility class for managing properties related to browser, URLs, and user credentials.
 */
public class PropertiesUtils {

    private final String CONFIG_FILE = "/src/test/resources/Config/config.properties";

    private final Properties properties;

    public PropertiesUtils() {
        properties = loadProperties(CONFIG_FILE);
    }

    private Properties loadProperties(String filePath) {
        Properties prop = new Properties();
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    /**
     * Retrieves the browser property.
     *
     * @return String representing the browser property.
     */
    public String setBrowser() {
        return getProperty("browser");
    }

    /**
     * Retrieves the URL property.
     *
     * @return String representing the URL property.
     */
    public String setUrl() {
        return getProperty("url");
    }

    /**
     * Retrieves the headless mode property and converts it to a boolean value.
     *
     * @return boolean value representing the headless mode property.
     */
    public boolean setHeadlessMode() {
        String headlessMode = getProperty("url");
        return Boolean.parseBoolean(headlessMode);
    }
}

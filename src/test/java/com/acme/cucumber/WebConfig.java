package com.acme.cucumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebConfig {
    public static WebDriver driver;
    public static  String API_URL = "https://homehealthy.netlify.app";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

    public WebConfig() {
    }
    public static WebDriver getSimpleDriver() {
        String API_URL = "https://homehealthy.netlify.app";
        String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", WebConfig.PATH_DRIVER);
        driver = new ChromeDriver();
        driver.get(API_URL);
        return driver;
    }

}

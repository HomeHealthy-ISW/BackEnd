package com.acme.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;

public class WebDriverConfig {
    WebDriver driver;
    String API_URL = "http:localhost:4200";
    String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

    @BeforeAll
    static void setupClass() {

    }

    @BeforeEach
    void setupTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", this.PATH_DRIVER);
        driver = new ChromeDriver();
        driver.get(API_URL);
        driver.findElement(By.xpath("/html/body/app-root/app-division-page/div/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("rodrities@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/form/mat-card-actions/div/button")).click();
        sleep(1000);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

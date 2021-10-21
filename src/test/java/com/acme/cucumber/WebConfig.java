package com.acme.cucumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class WebConfig {
    public  WebDriver driver;
    public  String API_URL = "https://homehealthy.netlify.app";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

    public WebConfig() {
        String API_URL = "https://homehealthy.netlify.app";
        String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver_95.exe";
        System.setProperty("webdriver.chrome.driver", WebConfig.PATH_DRIVER);
        driver = new ChromeDriver();
        driver.get(API_URL);
    }


    public void logInAsCollaborator() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/app-division-page/div/div[2]/div/button[2]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("jd123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("/html/body/app-root/app-collaborator-login/div/mat-card/form/mat-card-actions/div/button")).click();
        sleep(2000);
    }

    public void logIn() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/app-division-page/div/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("rodrities@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/form/mat-card-actions/div/button")).click();
        sleep(1000);
    }
    public void close(){
        driver.quit();
    }

}

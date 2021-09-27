package com.acme.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class fddffg extends WebDriverConfig{
    @Test
    void WhenUserSignInAndWantsToSeeDietsThenReturnsDietsNamePlan() throws InterruptedException {
        String expectedMessage = "Masa muscular";
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/div[1]/button")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-diets/div/div/mat-card/mat-card-actions/a")).click();
        sleep(1000);
        String foundMessageResult =  driver.findElement(By.cssSelector("body > app-root > app-diet-details > div > h1")).getText();
        assertThat(expectedMessage).isEqualTo(foundMessageResult);
    }
}

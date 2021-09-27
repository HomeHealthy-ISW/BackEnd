package com.acme.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.Thread.sleep;

public class diet extends WebDriverConfig {
    @Test
    void WhenUserSignInAndWantsToSeeDietsThenReturnsDietsNamePlan() throws InterruptedException {
        //Arrange
        String expectedMessage = "Masa muscular";
        //Act
        driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/div[1]/button")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-diets/div/div/mat-card/mat-card-actions/a")).click();
        sleep(1000);
        String foundMessageResult = driver.findElement(By.cssSelector("body > app-root > app-diet-details > div > h1")).getText();
        //Assert
        assertThat(expectedMessage).isEqualTo(foundMessageResult);
    }
}

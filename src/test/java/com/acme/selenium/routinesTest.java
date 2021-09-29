package com.acme.selenium;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.Thread.sleep;
public class routinesTest extends WebDriverConfig {

    @Test
    void WhenUserSignInAndWantsToSeeRoutinesThenReturnsDietsNamePlan() throws InterruptedException {
        String expectedRoutinePlanName = "Aumentar masa muscular";
        driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[2]")).click();
        sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-routines/div/div/mat-card/mat-card-actions/a")).click();
        sleep(2000);
        String foundMessageResult = driver.findElement(By.xpath("/html/body/app-root/app-routine-details/div/h1")).getText();
        assertThat(expectedRoutinePlanName).isEqualTo(foundMessageResult);

    }
}

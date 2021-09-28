package com.acme.selenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class collaborators  extends WebDriverConfig{

    @Test
    void WhenUserSignInAndWantToSeeCollaboratosProfileThenReturnsCollaboratorNameAndRole() throws InterruptedException {
        //Arrange
        String expectedCollaboratorNameAndRole = "John Doe\n" +
                "trainer";
        //Act
        driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
        sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-collaborators/div/mat-card/mat-card-content/table/tbody/tr[1]/td[5]/a")).click();
        sleep(1000);
        String foundCollaboratorNameAndRole = driver.findElement(By.xpath("/html/body/app-root/app-user-collaborator-profile/div/div[2]/div/h1")).getText();
        //Assert
        assertThat(expectedCollaboratorNameAndRole).isEqualTo(foundCollaboratorNameAndRole);


    }
}
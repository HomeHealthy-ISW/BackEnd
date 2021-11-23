package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class SeeCollaboratorProfile {

    WebConfig myDriver;

    public SeeCollaboratorProfile() {
        myDriver = new WebConfig();

    }

    @When("El usuario haga click en Ver perfil")
    public void elUsuarioHagaClickEnVerPerfil() throws InterruptedException {
       // sleep(3000);
        //myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborators/div/mat-card/mat-card-content/table/tbody/tr[1]/td[5]/a")).click();
       // sleep(2000);

        WebDriverWait wait  = new WebDriverWait(myDriver.driver, 10);
        WebElement btnSeeProfile = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-collaborators/div/mat-card/mat-card-content/table/tbody/tr[1]/td[5]/a"))
        );
        btnSeeProfile.click();
    }

    @Then("el sistema mostrará el perfil del especialista")
    public void elSistemaMostraráElPerfilDelEspecialista() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @When("Ningún especialista esté registrado en la aplicaicón")
    public void ningúnEspecialistaEstéRegistradoEnLaAplicaicón() {
    }

    @Then("El usuario no observará ningún especialista")
    public void elUsuarioNoObservaráNingúnEspecialista() {
    }

    @Given("El usuario HomeHealthy se encuentra en la página de Collaboratorsp")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaDeCollaboratorsp() throws InterruptedException {
        myDriver.logIn();
       /* WebDriverWait wait  = new WebDriverWait(myDriver.driver, 2);
        WebElement btnSeeProfile = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-collaborators/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]"))
        );
        btnSeeProfile.click();*/
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }
}

package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class SeeCollaboratorProfile {

    WebConfig myDriver;

    SeeCollaboratorProfile(){
        myDriver = new WebConfig();
    }

    @When("El usuario haga click en Ver perfil")
    public void elUsuarioHagaClickEnVerPerfil() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborators/div/mat-card/mat-card-content/table/tbody/tr[1]/td[5]/a")).click();
        sleep(2000);
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
}

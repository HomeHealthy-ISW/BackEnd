package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;


public class SeeSessionHistorial {

    WebConfig myDriver;

    public SeeSessionHistorial() {
        myDriver = new WebConfig();
    }

    @Given("El entrenador se encuentra en la página de Inicio")
    public void elEntrenadorSeEncuentraEnLaPáginaDeInicio() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);

    }

    @When("El entrenador haga click en Sessions")
    public void elEntrenadorHagaClickEnSessions() {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[3]")).click();

    }

    @Then("el sistema mostrará todo el historial de sesiones realizadas y agendadas.")
    public void elSistemaMostraráTodoElHistorialDeSesionesRealizadasYAgendadas() throws InterruptedException {
        sleep(1000);
        myDriver.close();
    }

    @Given("El nutricionista se encuentra en la página de Inicio")
    public void elNutricionistaSeEncuentraEnLaPáginaDeInicio() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);
    }

    @When("El nutricionista haga click en Sessions")
    public void elNutricionistaHagaClickEnSessions() {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[3]")).click();

    }

    @Then("el sistema no muestra las sesiones registradas debido a que es nuevo y no ha tenido ninguna")
    public void elSistemaNoMuestraLasSesionesRegistradasDebidoAQueEsNuevoYNoHaTenidoNinguna() throws InterruptedException {
        sleep(1000);
        myDriver.close();
    }
}

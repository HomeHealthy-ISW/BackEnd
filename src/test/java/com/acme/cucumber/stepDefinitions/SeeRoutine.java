package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class SeeRoutine {
    WebConfig myDriver;

    public SeeRoutine(){
        myDriver = new WebConfig();
    }

    @Given("El usuario HomeHealthy se encuentra en la página de Routines")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaDeRoutines() throws InterruptedException {
        myDriver.logIn();
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[2]")).click();
    }

    @When("El usuario haga click en Ver Detalle de las rutinas que tiene preparadas")
    public void elUsuarioHagaClickEnVerDetalleDeLasRutinasQueTienePreparadas() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-routines/div/div/mat-card/mat-card-actions/a")).click();
    }

    @Then("el sistema mostrará el horario con la rutina semanal del usuario.")
    public void elSistemaMostraráElHorarioConLaRutinaSemanalDelUsuario() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @When("El usuario no visualice ninguna rutina")
    public void elUsuarioNoVisualiceNingunaRutina() {
    }

    @Then("El usuario no tiene agendada ninguna rutina")
    public void elUsuarioNoTieneAgendadaNingunaRutina() {
    }

    @When("La página no cargue y se quedé en estado congelado")
    public void laPáginaNoCargueYSeQuedéEnEstadoCongelado() {
    }

    @Then("El usuario deberá de esperar a tener una buena conexión a la red para visualizar sus rutinas.")
    public void elUsuarioDeberáDeEsperarATenerUnaBuenaConexiónALaRedParaVisualizarSusRutinas() {
    }
}

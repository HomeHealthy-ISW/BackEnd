package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class SeeDietPlan {

    WebConfig myDriver;

    public SeeDietPlan() {
        myDriver = new WebConfig();
    }

    @Given("El usuario HomeHealthy se encuentra en la página de Diets")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaDeDiets() throws InterruptedException {
        myDriver.logIn();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[1]")).click();
    }

    @When("El usuario haga click en Ver Detalle de las dietas que tiene preparadas")
    public void elUsuarioHagaClickEnVerDetalleDeLasDietasQueTienePreparadas() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-diets/div/div/mat-card[1]/mat-card-actions/a")).click();
    }

    @Then("el sistema mostrará todo el detalle de las comidas que debe realizar durante la semana.")
    public void elSistemaMostraráTodoElDetalleDeLasComidasQueDebeRealizarDuranteLaSemana() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @When("El usuario no visualiza ninguna dieta")
    public void elUsuarioNoVisualizaNingunaDieta() {
    }

    @Then("El usuario no tiene agendada ninguna dieta")
    public void elUsuarioNoTieneAgendadaNingunaDieta() {
        myDriver.close();
    }

    @Then("El usuario deberá de esperar a tener una buena conexión a la red para visualizar sus dietas en caso tenga una agendada.")
    public void elUsuarioDeberáDeEsperarATenerUnaBuenaConexiónALaRedParaVisualizarSusDietasEnCasoTengaUnaAgendada() {
        myDriver.close();
    }
}

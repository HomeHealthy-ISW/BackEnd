package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class SeeUserHistorySessions {
    WebConfig myDriver;

    public SeeUserHistorySessions() {
        myDriver = new WebConfig();
    }

    @Given("El Usuario Homehealthy se encuentra en la página de Inicio")
    public void elUsuarioHomehealthySeEncuentraEnLaPáginaDeInicio() throws InterruptedException {
        myDriver.logIn();
        sleep(1000);
    }

    @When("El Usuario Homehealthy haga click en Sessions")
    public void elUsuarioHomehealthyHagaClickEnSessions() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[3]")).click();
        sleep(1000);
    }

    @Then("el sistema mostrará todo el historial de sesiones realizadas.")
    public void elSistemaMostraráTodoElHistorialDeSesionesRealizadas() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }
}

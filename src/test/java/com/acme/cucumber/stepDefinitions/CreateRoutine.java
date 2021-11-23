package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CreateRoutine {

    WebConfig myDriver;

    public CreateRoutine() {
        myDriver = new WebConfig();
    }

    @Given("El entrenador se dirigirá a la página de Routines")
    public void elEntrenadorSeDirigiráALaPáginaDeRoutines() throws InterruptedException {
        myDriver.logInAsCollaborator();
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[2]")).click();
        sleep(1000);
    }

    @When("El entrenador hará click en el ícono de añadir")
    public void elEntrenadorHaráClickEnElÍconoDeAñadir() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-routines/div/div[1]/button/span[1]/mat-icon")).click();
    }

    @Then("El sistema mostrará el formulario para poder crear una rutina de ejercicios personalizada")
    public void elSistemaMostraráElFormularioParaPoderCrearUnaRutinaDeEjerciciosPersonalizada() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @Given("El entrenador se encuentra en la página de Routines")
    public void elEntrenadorSeEncuentraEnLaPáginaDeRoutines() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[2]")).click();
    }

    @And("Completa todos los campos necesarios para la rutina")
    public void completaTodosLosCamposNecesariosParaLaRutina() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Maintenance");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("1");

    }

    @Then("El sistema añadirá la rutina al usuario que el Entrenador asigne")
    public void elSistemaAñadiráLaRutinaAlUsuarioQueElEntrenadorAsigne() {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-create-routine/div/form/div/button")).click();
    }

    @Given("El entrenador se encuentra en la página de Routine")
    public void elEntrenadorSeEncuentraEnLaPáginaDeRoutine() throws InterruptedException {

        myDriver.logInAsCollaborator();
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[2]")).click();


    }

    @And("Completa todos los campos necesarios para la rutina y no selecciona un usuario")
    public void completaTodosLosCamposNecesariosParaLaRutinaYNoSeleccionaUnUsuario() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Maintenance");

    }
}

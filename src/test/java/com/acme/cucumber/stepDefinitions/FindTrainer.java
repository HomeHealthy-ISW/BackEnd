package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindTrainer  {

    WebConfig driver;


    public FindTrainer(){
       driver = new WebConfig();
    }

    @Given("El usuario HomeHealthy nuevo desee buscar un especialista")
    public void elUsuarioHomeHealthyNuevoDeseeBuscarUnEspecialista() throws InterruptedException {
        driver.logIn();
        sleep(1000);
    }

    @When("El usuario hace click en Collaborators")
    public void elUsuarioHaceClickEnCollaborators() throws InterruptedException {
        sleep(1000);
        driver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }

    @Then("el sistema deberá mostrar un formulario con todos los especialistas actuales de la aplicación.")
    public void elSistemaDeberáMostrarUnFormularioConTodosLosEspecialistasActualesDeLaAplicación() throws InterruptedException {
        sleep(3000);
        driver.close();
    }

    @Given("El usuario HomeHealthy se encuentra en la página de Collaborators")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaDeCollaborators() throws InterruptedException {
        driver.logIn();
        sleep(1000);
        driver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }

    @When("El usuario escribe el nombre de manera incorrecta")
    public void elUsuarioEscribeElNombreDeManeraIncorrecta() {
        driver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("xxxxx");
    }

    @Then("el sistema no mostrará ningún dato por la mala digitación")
    public void elSistemaNoMostraráNingúnDatoPorLaMalaDigitación() throws InterruptedException {
        sleep(3000);
        driver.close();
    }




    @When("El usuario escribe el nombre de manera correcta")
    public void elUsuarioEscribeElNombreDeManeraCorrecta() {
        driver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("trainer");
    }
    @Then("el sistema mostrará los resultados que coincidan con los datos ingresados")
    public void elSistemaMostraráLosResultadosQueCoincidanConLosDatosIngresados() throws InterruptedException {
        sleep(3000);
        driver.close();
    }
}

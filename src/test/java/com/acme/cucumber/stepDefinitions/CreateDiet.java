package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CreateDiet {

    WebConfig myDriver;

    public CreateDiet() {
        myDriver = new WebConfig();
    }

    @Given("El nutricionista se dirigirá a la página de Diets")
    public void elNutricionistaSeDirigiráALaPáginaDeDiets() throws InterruptedException {
        myDriver.logInAsCollaborator();
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[1]")).click();
        sleep(1000);
    }

    @When("El nutricionista hará click en el ícono de añadir")
    public void elNutricionistaHaráClickEnElÍconoDeAñadir() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-diets/div/div[1]/button/span[1]/mat-icon")).click();
    }

    @Then("El sistema mostrará el formulario para poder crear una dieta personalizada")
    public void elSistemaMostraráElFormularioParaPoderCrearUnaDietaPersonalizada() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @Given("El nutricionista se encuentra en la página de Diets")
    public void elNutricionistaSeEncuentraEnLaPáginaDeDiets() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[1]")).click();

    }

    @And("Completa todos los campos necesarios para la dieta")
    public void completaTodosLosCamposNecesariosParaLaDieta() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Maintenance");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("1");

    }

    @Then("El sistema añadirá la dieta al usuario que el Nutricionista asigne")
    public void elSistemaAñadiráLaDietaAlUsuarioQueElNutricionistaAsigne() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-create-diet/div/form/div/button")).click();
        sleep(2000);
    }

    @And("Completa todos los campos necesarios para la dieta y no selecciona un usuario")
    public void completaTodosLosCamposNecesariosParaLaDietaYNoSeleccionaUnUsuario() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Maintenance");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("comida 1");
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("comida 2");
    }

    @Then("El sistema no le permitirá añadir la dieta a un usuario con campo vacío.")
    public void elSistemaNoLePermitiráAñadirLaDietaAUnUsuarioConCampoVacío() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }
}

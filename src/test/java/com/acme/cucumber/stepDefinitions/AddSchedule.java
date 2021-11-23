package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class AddSchedule {
    WebConfig myDriver = new WebConfig();

    public AddSchedule() {
        myDriver = new WebConfig();
    }

    @Given("El nutricionista se encuentra en su perfil")
    public void elNutricionistaSeEncuentraEnSuPerfil() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-home/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
        sleep(1000);
    }

    @When("El nutricionista haga click en el date picker podrá seleccionar una fecha y hora")
    public void elNutricionistaHagaClickEnElDatePickerPodráSeleccionarUnaFechaYHora() throws InterruptedException {
        sleep(3000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-profile/div/div[3]/mat-form-field[2]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]/svg/path")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/ngx-mat-datetime-content/div[2]/button")).click();
        sleep(1000);
    }

    @And("haga click en el ícono de añadir")
    public void hagaClickEnElÍconoDeAñadir() {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-profile/div/div[3]/button")).click();
    }

    @Then("el sistema añadirá el horario para que los usuarios puedan agendarlo")
    public void elSistemaAñadiráElHorarioParaQueLosUsuariosPuedanAgendarlo() {
        myDriver.close();
    }

  /*  @Given("El entrenador se encuentra en su perfil")
    public void elEntrenadorSeEncuentraEnSuPerfil() throws InterruptedException {
        myDriver.logInAsCollaborator();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-profile/app-collaborator-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
        sleep(1000);
    }

    @When("El entrenador haga click en el date picker podrá seleccionar una fecha y hora")
    public void elEntrenadorHagaClickEnElDatePickerPodráSeleccionarUnaFechaYHora() throws InterruptedException {
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborator-profile/div/div[3]/mat-form-field[2]/div/div[1]/div[2]/mat-datepicker-toggle/button/span[1]/svg/path")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"cdk-overlay-0\"]/ngx-mat-datetime-content/div[2]/button")).click();
        sleep(1000);
    }*/
}

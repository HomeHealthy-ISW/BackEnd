package com.acme.cucumber.stepDefinitions;

import com.acme.cucumber.WebConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class ScheduleSession {

    WebConfig myDriver;

    public ScheduleSession() {
        myDriver = new WebConfig();
    }

    @Given("El Usuario HomeHealthy se encuentra en la página Collaborators")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaCollaborators() throws InterruptedException {
        myDriver.logIn();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }

    @When("El usuario haga click en Ver perfil del entrenador")
    public void elUsuarioHagaClickEnVerPerfilDelEntrenador() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-collaborators/div/mat-card/mat-card-content/table/tbody/tr[1]/td[5]/a")).click();
    }

    @And("haga click en Select Schedule")
    public void hagaClickEnSelectSchedule() throws InterruptedException {
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-user-collaborator-profile/div/div[3]/mat-form-field/div/div[1]/div")).click();
    }

    @Then("el sistema mostrará todos los horarios disponibles por los especialistas")
    public void elSistemaMostraráTodosLosHorariosDisponiblesPorLosEspecialistas() throws InterruptedException {
        sleep(3000);
        myDriver.close();
    }

    @And("haga click en Select Schedule y no elije ningún un horario")
    public void hagaClickEnSelectScheduleYNoElijeNingúnUnHorario() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-user-collaborator-profile/div/div[3]/mat-form-field/div/div[1]/div")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("/html/body/div[2]/div[1]")).click();
    }

    @And("haga click en Schedule")
    public void hagaClickEnSchedule() throws InterruptedException {
        sleep(1020);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-user-collaborator-profile/div/div[3]/button/span[1]")).click();
    }

    @Then("el sistema no agendará la sesión con el especialista porque no agenda un valor nulo")
    public void elSistemaNoAgendaráLaSesiónConElEspecialistaPorqueNoAgendaUnValorNulo() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }

    @And("haga click en Select Schedule y elije un horario")
    public void hagaClickEnSelectScheduleYElijeUnHorario() throws InterruptedException {
        sleep(2000);
        myDriver.driver.findElement(By.xpath("/html/body/app-root/app-user-collaborator-profile/div/div[3]/mat-form-field/div/div[1]/div")).click();
        sleep(1000);
        myDriver.driver.findElement(By.xpath("//*[@id=\"mat-option-5\"]/span")).click();
    }

    @Then("el sistema agendará la sesión con el especialista")
    public void elSistemaAgendaráLaSesiónConElEspecialista() throws InterruptedException {
        sleep(2000);
        myDriver.close();
    }
}

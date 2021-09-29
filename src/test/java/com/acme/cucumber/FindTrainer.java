package com.acme.cucumber;

import com.acme.selenium.WebDriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindTrainer  {

    public static WebDriver driver;
    public static  String API_URL = "https://homehealthy.netlify.app";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";


    public FindTrainer(){
        System.setProperty("webdriver.chrome.driver", WebConfig.PATH_DRIVER);
        driver = new ChromeDriver();
        driver.get(API_URL);
    }

    @Given("El usuario HomeHealthy nuevo desee buscar un especialista")
    public void elUsuarioHomeHealthyNuevoDeseeBuscarUnEspecialista() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/app-root/app-division-page/div/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("rodrities@hotmail.com");
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/form/mat-card-actions/div/button")).click();
        sleep(1000);
    }

    @When("El usuario hace click en Collaborators")
    public void elUsuarioHaceClickEnCollaborators() throws InterruptedException {
        sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }

    @Then("el sistema deberá mostrar un formulario con todos los especialistas actuales de la aplicación.")
    public void elSistemaDeberáMostrarUnFormularioConTodosLosEspecialistasActualesDeLaAplicación() {
    }

    @Given("El usuario HomeHealthy se encuentra en la página de Collaborators")
    public void elUsuarioHomeHealthySeEncuentraEnLaPáginaDeCollaborators() throws InterruptedException {
        sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-home/app-user-header/mat-toolbar/mat-toolbar-row/div/a[4]")).click();
    }

    @When("El usuario escribe el nombre de manera incorrecta")
    public void elUsuarioEscribeElNombreDeManeraIncorrecta() {
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("xxxxx");
    }

    @Then("el sistema no mostrará ningún dato por la mala digitación")
    public void elSistemaNoMostraráNingúnDatoPorLaMalaDigitación() {
    }

    @When("El usuario escribe el nombre de manera correcta")
    public void elUsuarioEscribeElNombreDeManeraCorrecta() {
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("trainer");
    }

    @Then("el sistema mostrará los resultados que coincidan con los datos ingresados")
    public void elSistemaMostraráLosResultadosQueCoincidanConLosDatosIngresados() {
    }
}

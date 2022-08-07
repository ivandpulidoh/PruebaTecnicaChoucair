package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.assertj.core.error.ShouldBe;
import org.openqa.selenium.WebDriver;
import starter.InformacionSeguridad.CrearPassword;
import starter.informacionDispotivo.RegistrarInformacionDispotivo;
import starter.informacionPersonal.RegistrarInformacionPersonal;
import starter.informacionUbicacion.RegistrarInformacionUbicacion;
import starter.navegacion.NavegarA;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.paginaBienvenida.MensajePaginaBienvenida;
import starter.paginaBienvenida.PaginaBienvenidaForm;

import javax.naming.directory.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegistrarseStepDefinitions {

    Actor actor = Actor.named("usuario");

    @Managed
    WebDriver driver;

    @Before
    public void setupActor() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("El usuario ingresa a la pagina Utest")
    public void navegarUrl(){
        actor.wasAbleTo(NavegarA.paginaDeInicioUtest());
    }

    @When("El usuario da clic en el boton JoinToDay y diligencia la siguiente informacion personal {string}, {string}, {string}, {string}")
    public void el_usuario_da_clic_en_el_boton_join_to_day_y_diligencia_la_siguiente_informacion_personal(String nombre, String apellido, String correo, String fechaNacimiento) {
        actor.attemptsTo(RegistrarInformacionPersonal.ingresarInformacion(nombre,apellido,correo,fechaNacimiento));
    }

    @When("El usuario da clic en Siguiente y diligencia la informacion de su ubicacion en el step2")
    public void dar_clic_en_siguiente_y_diligenciar_informacion_ubicacion(){
        actor.attemptsTo(RegistrarInformacionUbicacion.continuarSiguientePagina());
    }

    @When("El usuario da clic en Siguiente y diligencia la informacion de su dispositivo en el step3")
    public void dar_clic_en_siguiente_y_diligenciar_la_informacion_del_dispositivo(){
        actor.attemptsTo(RegistrarInformacionDispotivo.ingresarInformacion());
    }

    @When("El usuario da clic en Siguiente y establece una contrasena segura en el step4")
    public void dar_clic_en_siguiente_y_establece_una_contrasena_segura(){
        actor.attemptsTo(CrearPassword.ingresarInformacion());
    }

    @Then("El usuario deberia ser redireccionado a la pagina de bienvenida con el siguiente msj {string}")
    public void deberia_ser_redireccionado_a_la_pagina_de_bienvenida(String msj){
        System.out.println( "println " + MensajePaginaBienvenida.paginaBienvenida().answeredBy(actor));
        actor.should(
                seeThat("Deberia cargar la pagina de bienvenida", MensajePaginaBienvenida.paginaBienvenida(),equalTo(msj))
        );
        System.out.println( "println " + MensajePaginaBienvenida.paginaBienvenida().answeredBy(actor));
    }

}

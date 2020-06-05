package com.banistmo.www.Step_Definitions;

import com.banistmo.www.tasks.SeleccionarOpcion;
import com.banistmo.www.user_interfaces.HomeAprenderFacil;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPDFStepDefinitions {

    HomeAprenderFacil homeAprenderFacil;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^aprender mas de Ciberseguridad$")
    public void aprenderMasDeCiberseguridad(){
        theActorCalled("Sebastian").attemptsTo(Open.browserOn(homeAprenderFacil));
    }

    @When("^voy aprender sobre ciber seguridad$")
    public void voyAprenderSobreCiberSeguridad() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.seleccionarOpcion());
    }

    @Then("^valido que el pdf se encuentre disponible$")
    public void validoQueElPdfSeEncuentreDisponible() {
    }


}

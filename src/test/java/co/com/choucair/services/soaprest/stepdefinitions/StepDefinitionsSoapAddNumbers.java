package co.com.choucair.services.soaprest.stepdefinitions;

import co.com.choucair.services.soaprest.Task.AddNumbers;
import co.com.choucair.services.soaprest.questions.LastResponseStatus;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import java.util.List;

import static co.com.choucair.services.soaprest.utils.enums.SoapService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionsSoapAddNumbers {

    @When("^you add two number$")

    public void youAddTwoNumber(List<String>values) {
        theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));

    }
        @Then("^I should see the response of the service is (\\d+)$")
        public void iShouldSeeTheResponseOfTheServiceIs(int code) {
            theActorInTheSpotlight().should(seeThat("last response status code is 200",
                            LastResponseStatus.isEqualsTo(code))
            );


        }

    }




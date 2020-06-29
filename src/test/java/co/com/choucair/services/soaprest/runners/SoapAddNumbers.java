package co.com.choucair.services.soaprest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/add_two_numbers.feature"},
glue = {"co.com.choucair.services.soaprest.stepdefinitions","co.com.choucair.services.soaprest.utils"},
snippets = CAMELCASE)

public class SoapAddNumbers {
}

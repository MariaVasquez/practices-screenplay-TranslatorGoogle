package co.com.prueba.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/traductor_google.feature",
        glue = "co.com.prueba.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@TestModels"
)
public class TraductorGoogleRunner {
}

package in.automationtesting.demo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/demo_site.feature",
		glue = "in.automationtesting.demo.stepdefinitions",
//				glue = "classpath:co.com.bancolombia.certificacion.google",
		snippets = SnippetType.CAMELCASE)
public class DemoSiteRunner {

}

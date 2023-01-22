package name.lattuada.trading.tests.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "src/test/resources",
        monochrome = true,
        glue = {"name.lattuada.trading.tests.steps","name.lattuada.trading.tests.configuration"})
public class CucumberTest {
}

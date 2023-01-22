package name.lattuada.trading.tests.configuration;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import name.lattuada.trading.TradingApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = TradingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberSpringConfiguration {

}

package Runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\farha\\eclipse-workspace\\Medical\\src\\test\\java\\features\\medco.feature",
				glue= {"steps"},
				plugin= {"html:target/CucumberCapstone-Medicare.html",
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
})

public class TestRunnerMedicare {

}
package testrunners;


import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(features = { "src/test/resources/features/LoginPage.feature" }, glue = { "Steps", "ApplicationHooks" },

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"

		}

)

public class TestNgRunner1 extends AbstractTestNGCucumberTests {

}

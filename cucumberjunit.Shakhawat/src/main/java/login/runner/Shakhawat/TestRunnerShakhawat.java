package login.runner.Shakhawat;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=("Features"),
glue=("Step.definitions"))


public class TestRunnerShakhawat {

}

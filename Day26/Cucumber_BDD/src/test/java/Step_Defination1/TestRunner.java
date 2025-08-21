package Step_Defination1;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features2",
                 glue={"Step_Defination1"},
                 plugin= {"pretty","html:target/htmlreport.html",
		                           "json:target/jsonreport",
		                           "junit:target/junitreport"})
public class TestRunner {
 
}
 
 
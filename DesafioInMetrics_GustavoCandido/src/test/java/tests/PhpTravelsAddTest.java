package tests;
 
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features = "features",tags = "@addFeature",
					glue = "steps",format = {"pretty", "html:target/cucumber"}) 

public class PhpTravelsAddTest { }
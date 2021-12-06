package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java"},
        glue={"stepDefination"},
        dryRun = false
)
public class _0_1_Runner_genel extends AbstractTestNGCucumberTests {


}

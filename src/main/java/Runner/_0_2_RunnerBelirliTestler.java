package Runner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/contactUs1.feature"},
        glue = {"stepDefination"},
        //plugin mantıgı testi yaptıktan sonra basit raporlar vermesi
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml"
        },
        dryRun = false



)
public class _0_2_RunnerBelirliTestler extends AbstractTestNGCucumberTests{

}

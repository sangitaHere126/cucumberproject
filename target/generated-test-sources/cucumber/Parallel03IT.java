import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/mkmanish/workspace4/CucumberProject/src/test/resources/com/here/fcnr/Portfolio.feature:15"},
        plugin = {"json:C:/Users/mkmanish/workspace4/CucumberProject/target/parallel-cucumber/3.json", "html:C:/Users/mkmanish/workspace4/CucumberProject/target/parallel-cucumber/3"},
        monochrome = true,
        glue = {"com.here.fcnr.steps"})
public class Parallel03IT {
}

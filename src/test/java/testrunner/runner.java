package testrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/feature",
		glue ={"stepdefinition"},
			monochrome = true,
					dryRun = false,
					//tags={"@test1","@test2"}, //skipping tag
							//tags={"@register"},  
							//tags={"@login"},
							//tags={"@login1"},
							//tags={"@test1"},
							//tags={"@tes2"},
							//tags={"@test3"}, 
							//tags={"@test4"},									
plugin = {"pretty","html:Reports","json:Reports/jsonreport.json","junit:Reports/xmlreport.xml" } 			
		
		)

public class runner {


}

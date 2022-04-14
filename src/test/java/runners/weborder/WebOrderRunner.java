package runners.weborder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//THESE ARE INTERVIEW QUESTIONS
//Runner class is a way to run your all featue files from here
//@RunWuth annotation comes from Junit and it executes the feature file steps
//cucumberOptions is a special annotation that have some key words
//features: this is the location of feature files--THIS IS CONTENT ROOT
//glue:this is the location of step definitions----THIS SHOULD BE SOURCE ROOT AND DELATE JAVA PART TO MAKE IT MORE GENERAL
//dryRun: this is a way to get snips without executing the whole implementations
//it means if you make it true, you will get immediately unimplemented snips.
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.weborder/Order.feature",//this is path for feature files...if you want
        //to make regression test, just remove /Order.feature part then it will run all the tests
        glue = "stepdefinitions/Webordersteps",//this is path for step definitions-->
        dryRun = false, //when this is true, it takes unimplemented snips then you need to switch it to the false, otherwise, it will not even go to the webpage,all tests will pass
        //so it needs to stay as false after you take your unimplemented snips
        tags= ""
        //you can use and, and not--> and not means you one case you may have smoke and other one smoke and test1 so if you make
        //smake and not test1 then it will run just smoke ones.
)

public class WebOrderRunner {

}

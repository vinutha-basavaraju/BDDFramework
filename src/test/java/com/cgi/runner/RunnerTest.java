package com.cgi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/features/Employee.feature"}
		,glue= {"com.cgi.steps"}
		,dryRun=true
	    ,plugin={"html:target/cucumber-report.html"}
		)

public class RunnerTest extends AbstractTestNGCucumberTests {


	
}

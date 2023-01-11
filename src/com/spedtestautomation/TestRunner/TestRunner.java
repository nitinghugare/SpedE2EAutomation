package com.spedtestautomation.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.spedtestautomation.DriverManager.WebDriverManager;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.*;

@CucumberOptions (
        features = "./features/"
        ,glue = {"com.spedtestautomation.StepDef"}
        ,tags = {"@TestDemo"}
        ,plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json"}
        ,monochrome = true
        )
public class TestRunner extends WebDriverManager {
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeSuite(alwaysRun = true)
    public void setUpClass() throws Exception {    	
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")    
    public void feature(PickleEventWrapper eventwrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
       // return testNGCucumberRunner.provideFeatures();    	
    	 return testNGCucumberRunner.provideScenarios();
    }  
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}
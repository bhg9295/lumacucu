package com.softwaretesting.magneto.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/softwaretesting/magneto",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
              }
)
public class SmokeRunner {

    @AfterClass
    public static void setUp() {


    }
}

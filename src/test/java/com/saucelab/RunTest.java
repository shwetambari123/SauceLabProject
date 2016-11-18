package com.saucelab;

/**
 * Created by Yogesh on 14-09-2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(format="html:target/CucumberReports",
        features="src/test/features/",
        tags="@smoke")


public class RunTest {
}

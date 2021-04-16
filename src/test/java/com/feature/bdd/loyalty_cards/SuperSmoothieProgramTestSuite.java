package com.feature.bdd.loyalty_cards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features.loyalty_cards",
        glue = "com.feature.bdd"
)
public class SuperSmoothieProgramTestSuite {
}

package com.feature.bdd;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = {"classpath:com.feature.bdd/calculator.feature"})
public class CalculatorTest {
}



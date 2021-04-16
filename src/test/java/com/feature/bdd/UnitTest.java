package com.feature.bdd;


import com.feature.*;

import com.utilities.DriverFactory;

import org.apache.commons.lang3.SystemUtils;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.sql.Driver;

public class UnitTest {




    public static WebDriver driver;


    @BeforeClass
    public static void beforeEveryTest() {

        driver =  DriverFactory.initDriver();

    }
    @Test
    public void canGoToHomePage() {

        Pages.homePage().goTo(driver);
        Assert.assertTrue(Pages.homePage().isAt(driver));
    }

    @Test
    public void canGoToJavaPathPage() {
        Pages.pathPages().goTo(driver);
        PathPage pathPage = Pages.pathPages().getPathPage("Java", driver);
        pathPage.goTo(driver);
        //Assert.assertTrue(pathPage.isAtPathPage("Java"));
    }

    @AfterClass
    public static void cleanUp() {

        DriverFactory.close();


    }

}

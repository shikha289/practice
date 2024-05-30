package com.jtc.Tests;

import com.jtc.Factory.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void startDriver() {
        driver = new DriverManager().initializeDriver();
    }
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }

}

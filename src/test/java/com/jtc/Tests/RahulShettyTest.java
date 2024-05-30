package com.jtc.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RahulShettyTest extends BaseTest {
    @Test
    public void NavigationTest() throws InterruptedException {
        driver.get("https://www.rahulshettyacademy.com/");
Thread.sleep(10);
    }
}

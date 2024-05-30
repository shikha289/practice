package com.jtc;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AmazonTest {
    @Test
    public void testAmazon() throws IOException {
        FileReader reader=new FileReader("C:\\Users\\lenovo\\Desktop\\intellij\\maven\\practice\\properties1.properties");
        Properties props=new Properties();
        props.load(reader);
      WebDriverWait wait;
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get(props.getProperty("amazonUrl"));
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
driver.quit();

    }
}

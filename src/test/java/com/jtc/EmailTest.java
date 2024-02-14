package com.jtc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class EmailTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        FileReader reader=new FileReader("C:\\Users\\lenovo\\Desktop\\intellij\\maven\\practice\\properties1.properties");
        Properties props=new Properties();
        props.load(reader);
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setExperimentalOption("debuggerAddress","localhost:9222");
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverWait wait;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASKXGp3f00wq5hWmAPBFotPGgQHm-vzG0KN80mVXJEZkClnOcuQbN3CluHOhJx3RGhObOPtaHkJ_wA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-570407541%3A1707586879910430&theme=glif");
        //driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(props.getProperty("username"));
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Passwd']"))).sendKeys(props.getProperty("password"));
        //driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("shikha289");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='aoD hl']")).sendKeys("deepayadav.289@gmail.com");
        driver.findElement(By.xpath("//div[@id=':sk']")).sendKeys("hello i am shikha");
        driver.findElement(By.xpath("(//div[@id=':r0'])[1]")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Sent']")).click();
        WebElement sentemailcount= driver.findElement(By.cssSelector("body > div:nth-child(24) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > span:nth-child(1) > span:nth-child(2)"));
        String count=sentemailcount.getText();
        System.out.println(count);

        //driver.quit();
    }
}

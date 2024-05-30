package com.jtc.Tests;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Voiceoc {
    @Test
    public void runTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("(//input[@id='user-name'])[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("(//input[@id='login-button'])[1]")).click();
        driver.findElement(By.xpath("(//button[@id='add-to-cart-sauce-labs-backpack'])[1]")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();//checkout
        driver.findElement(By.xpath("(//button[normalize-space()='Checkout'])[1]")).click();
        driver.findElement(By.xpath("(//input[@id='first-name'])[1]")).sendKeys("deepak");
        driver.findElement(By.xpath("(//input[@id='last-name'])[1]")).sendKeys("yadav");
        driver.findElement(By.xpath("(//input[@id='postal-code'])[1]")).sendKeys("226011");
driver.findElement(By.xpath("(//input[@id='continue'])[1]")).click();//continue
        driver.findElement(By.xpath("(//button[normalize-space()='Finish'])[1]")).click();//finish
        String actual=driver.findElement(By.xpath("(//h2[normalize-space()='Thank you for your order!'])[1]")).getText();
        Assert.assertEquals(actual,"Thank you for your order!");
        Thread.sleep(2000);


    }
}

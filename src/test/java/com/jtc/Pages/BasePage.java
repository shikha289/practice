package com.jtc.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BasePage {
    private WebDriver driver;
    public WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,Duration.ofSeconds(30));

    }
}

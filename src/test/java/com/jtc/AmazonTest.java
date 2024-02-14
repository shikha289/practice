package com.jtc;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
    @Test
    public void testAmazon(){
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=12790269414721518963&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303027&hvtargid=kwd-10573980&hydadcr=14453_2371562");


    }
}

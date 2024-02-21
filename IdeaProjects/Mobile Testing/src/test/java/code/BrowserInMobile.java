package code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserInMobile extends BaseTest{
@Test
    public void BrowserMobile(){

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        //swipe page
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)","");
        String text= driver.findElement(By.xpath("//a[text()='Devops']")).getText();
        Assert.assertEquals(text,"Devops");
    }

}

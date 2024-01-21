package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shoppersdrugmart.ca/");
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.id("FrontShopShopNavNode")).click();
        driver.findElement(By.className("top-nav_navItem__d3DmU")).click();
        driver.findElement(By.cssSelector("button[type='button']")).click();
        driver.findElement(By.xpath("//li[@id='FrontShopPharmacyServicesLocaledLink']")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Health & Wellness")).click();
        driver.findElement(By.xpath("//ul/li[@id='FrontShopElectronicsNavNode']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/ul[1]/li[6]")).click();
        driver.findElement(By.partialLinkText("Sign")).click();
    }
}
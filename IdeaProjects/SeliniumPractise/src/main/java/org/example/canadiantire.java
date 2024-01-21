package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class canadiantire {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();

        WebDriver driver=new EdgeDriver();

        driver.get("https://www.canadiantire.ca/en.html");

        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//p[contains(text(),'Join Triangle Rewards')]")).click();

        System.out.println("element is clicked");

        Thread.sleep(2000);

        driver.quit();

    }
    }


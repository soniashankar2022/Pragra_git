package SeliniumActionandFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouseInteractions {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement locator=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions a = new Actions(driver);
        a.moveToElement(locator).contextClick().build().perform();
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


    }
}


package SeliniumActionandFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        ////switching frame with index
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);


//switching frame with webelement

        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        //driver.findElement(By.id("draggable")).click();

        Actions a=new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.cssSelector("div#droppable"));
        a.dragAndDrop(source,target).build().perform();
    }
}

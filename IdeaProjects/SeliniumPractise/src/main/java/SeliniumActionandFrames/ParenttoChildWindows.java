package SeliniumActionandFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ParenttoChildWindows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver diver = new ChromeDriver();
        diver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        diver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = diver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> it = windows.iterator();

        String parentId = it.next();

        String childId = it.next();

        diver.switchTo().window(childId);

        System.out.println(diver.findElement(By.cssSelector(".im-para.red")).getText());

        diver.findElement(By.cssSelector(".im-para.red")).getText();

        String emailId = diver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        diver.switchTo().window(parentId);

        diver.findElement(By.id("username")).sendKeys(emailId);


    }


}
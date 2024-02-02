package SeliniumActionandFrames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AssignmentonWindowHandles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href=\"/windows\"]")).click();
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentwindow= it.next();
        String Childwindow = it.next();
       // String SubChildwindow = it.next();
        driver.switchTo().window(Childwindow);



        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

        driver.switchTo().window(parentwindow);



        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
    }
}

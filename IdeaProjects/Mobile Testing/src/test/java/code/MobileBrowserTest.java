package code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest{

    @Test
    public void BrowserTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
        Thread.sleep(10000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}

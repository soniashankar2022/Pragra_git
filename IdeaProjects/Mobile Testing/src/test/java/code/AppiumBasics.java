package code;

import code.BaseTest;
import io.appium.java_client.AppiumBy;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppiumBasics extends BaseTest {

    @Test
    public void AppiumTest() throws MalformedURLException, InterruptedException {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        //String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        //Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Sonia Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
    }
}

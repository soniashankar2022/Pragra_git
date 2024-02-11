package code;

import code.Baseclass;
import io.appium.java_client.AppiumBy;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppiumBasics extends Baseclass {
    public AppiumBasics() {
    }

    @Test
    public void AppiumTest() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = this.driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys(new CharSequence[]{"Sonia Wifi"});
        ((WebElement) this.driver.findElements(AppiumBy.className("android.widget.Button")).get(1)).click();
    }
}

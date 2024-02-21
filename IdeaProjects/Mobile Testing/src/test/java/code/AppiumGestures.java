package code;

import code.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AppiumGestures extends BaseTest {
    public AppiumGestures() {
    }

    public void AppiumGestures() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Custom Adapter']")).click();
        Thread.sleep(9000L);
        WebElement xpath = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        Thread.sleep(9000L);
        longpress(xpath);
        String popuptext =driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(popuptext, "Sample menu");
        Assert.assertTrue(this.driver.findElement(By.id("android:id/title")).isDisplayed());
    }
}

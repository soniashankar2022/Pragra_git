package code;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.net.URL;

public class MiscellaneousActivities extends BaseTest {


    @Test
    public void MiscellaneousTest() throws InterruptedException {
        Activity activity=new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        //driver.startActivity(activity);

        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent"," io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));

        //driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        //Thread.sleep(9000L);
        //driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
       // Thread.sleep(9000L);
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
        Thread.sleep(9000L);

//Device Rotation
        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
        driver.rotate(landscape);


        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");


        //copy and paste
        driver.setClipboardText("Sonia Wifi");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }
}

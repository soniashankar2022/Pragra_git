package Assignments;

import code.BaseTest;
import code.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 extends BaseTest {
    @Test
    public void BasicAssignment() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("App")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        driver.findElement(By.id("io.appium.android.apis:id/two_buttons")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        driver.findElement(By.id("io.appium.android.apis:id/two_buttons")).click();
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();


        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
        Thread.sleep(3000);
        //Assertion
        String text = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(text, "Header title");
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
        driver.findElement(By.id("android:id/button2")).click();
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
        driver.findElement(By.id("android:id/button3")).click();


    //    driver.findElement(By.id("OK Cancel dialog with ultra long message")).click();
    //    String title = driver.findElement(By.id("android:id/alertTitle")).getText();
        //Assert.assertEquals(title, "Header title");
        //driver.findElement(By.id("android:id/button1")).click();
        //driver.findElement(By.id("OK Cancel dialog with ultra long message")).click();
        //driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
        //driver.findElement(By.id("OK Cancel dialog with ultra long message")).click();
        //driver.findElement(By.id("android:id/button3")).click();

        Thread.sleep(3000);
        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command one\"]")).click();
        String message = driver.findElement(By.id("android:id/message")).getText();
        Assert.assertEquals(message, "You selected: 0 , Command one");
        driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command four\"]")).click();
        String compare = driver.findElement(By.className("android.widget.TextView")).getText();
        Assert.assertEquals(compare, "You selected: 3 , Command four");
    }
}

package code;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragandDrop extends  BaseTest{
@Test
    public void DragTest() throws InterruptedException {
    driver.findElement(AppiumBy.accessibilityId("Views")).click();
    driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
  WebElement source=  driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

    ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) source).getId(),
            "endX", 833,
            "endY", 751
    ));
    Thread.sleep(9000);
String result=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
    Assert.assertEquals(result,"Dropped!");
}
}

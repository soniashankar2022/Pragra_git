import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.example.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics extends Baseclass {

    @Test
    public void AppiumTest() throws MalformedURLException, InterruptedException {

        //tell appium what kind of driver using
        //* create object for android with that object we are going to access the class
        //* object takes two arguments(service and capabilities)
        //*Server details we need to send as first argument in the class
        //* capabilities- what os we want to execute . what version number - also info abput apps which we are trying to automate



        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\'3. Preference dependencies']")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id=\"android:id/checkbox\"]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("Sonia Wifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        //Assert validation


    }
}

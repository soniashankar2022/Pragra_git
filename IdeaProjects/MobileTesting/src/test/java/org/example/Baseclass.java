package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Baseclass {

public    AndroidDriver driver;
public AppiumDriverLocalService builder;
@BeforeClass
    public void configuration() throws MalformedURLException {
         builder = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vivek\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        builder.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Soniaemulator");

        // Set adbExecTimeout directly in UiAutomator2Options
        options.setCapability("adbExecTimeout", 60000);

        options.setApp("C:\\\\Users\\\\vivek\\\\IdeaProjects\\\\MobileTesting\\\\src\\\\test\\\\Resources\\\\ApiDemos-debug.apk");

       driver = new AndroidDriver(new URL(" http://127.0.0.1:4723"), options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public void teardown(){
        driver.quit();
        builder.stop();
    }
}

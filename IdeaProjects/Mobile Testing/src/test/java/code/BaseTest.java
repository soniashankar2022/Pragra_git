package code;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configuration() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vivek\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Soniaemulator");
        options.setChromedriverExecutable("C:\\Users\\vivek\\Downloads\\chromedriver-win32");

        // Set adbExecTimeout directly in UiAutomator2Options
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:adbExecTimeout", 15000);

      //  options.setApp("C:\\Users\\vivek\\IdeaProjects\\Mobile Testing\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
       options.setApp("C:\\Users\\vivek\\IdeaProjects\\Mobile Testing\\src\\test\\java\\Resources\\General-Store.apk");

        driver = new AndroidDriver(new URL(" http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

    }

    public void longpress(WebElement xpath) {
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",

                ImmutableMap.of("elementId", ((RemoteWebElement) xpath).getId(), "duration", 2000));

    }

    public void swipe(WebElement ele, String direction) {
        ((JavascriptExecutor) driver).executeScript("mobile:swipeGesture",
                ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));
    }

    public Double getFormattedAmount(String amount){
        Double price= Double. parseDouble(amount.substring(1));
        return price;
    }
    @AfterClass
    public void teardown() {
        driver.quit();
        service.stop();
    }
}

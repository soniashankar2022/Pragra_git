import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {

        //tell appium what kind of driver using

        //* create object for android with that object we are going to access the class
        //* object takes two arguments(service and capabilities)
        //*Server details we need to send as first argument in the class
        //* capabilities- what os we want to execute . what version number - also info abput apps which we are trying to automate

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Soniaemulator");

        // Set adbExecTimeout directly in UiAutomator2Options
        options.setCapability("adbExecTimeout", 60000);

        options.setApp("C:\\\\Users\\\\vivek\\\\IdeaProjects\\\\MobileTesting\\\\src\\\\test\\\\Resources\\\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL(" http://127.0.0.1:4723"),options );
        //Actual automation
    }
}

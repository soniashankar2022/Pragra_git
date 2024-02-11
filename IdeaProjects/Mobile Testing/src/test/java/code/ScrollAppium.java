package code;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollAppium extends Baseclass {

    @Test
    public void Scrolltest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        //Where to scroll is known prior
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(9000);

        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "direction", "down",
                    "left", 100, "top", 100, "width", 200, "height", 200, "percent", 3.0));
        } while (canScrollMore);
    }

}

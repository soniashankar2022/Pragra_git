package code;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Test
public class HybridAndNativeApp extends BaseTest {


    public void ecommerceTest() throws InterruptedException {
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sonia");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        Thread.sleep(9000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Canada']")).click();
        Thread.sleep(9000);
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(9000);
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();


        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(9000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increase timeout to 30 seconds

        Thread.sleep(9000);
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
        Thread.sleep(9000);
        List<WebElement> Productprices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int count = Productprices.size();
        double totalsum = 0;
        for (int i = 0; i < count; i++) {
            String amountString = Productprices.get(i).getText();
            //   Double price=Double.parseDouble(amountString.substring(1));
            Double price = getFormattedAmount(amountString);
            totalsum = totalsum + price;
        }
        String displaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        Double displayFormattedSum = getFormattedAmount(displaySum);
        Assert.assertEquals(Optional.of(displayFormattedSum), Optional.of(totalsum));
        WebElement xpath = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        longpress(xpath);
        String title = driver.findElement(By.id("com.androidsample.generalstore:id/alertTitle")).getText();
        Assert.assertEquals(title, "Terms Of Conditions");
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(10000);
        Set<String> context= driver.getContextHandles();
        for(String contextprovider:context ){
            System.out.println(contextprovider);
        }
        Thread.sleep(10000);
       driver.context("WEBVIEW_com.androidsample.generalstore");
        Thread.sleep(9000);
        driver.findElement(By.name("q")).sendKeys("rahul shetty academy");
        Thread.sleep(10000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");



    }
}



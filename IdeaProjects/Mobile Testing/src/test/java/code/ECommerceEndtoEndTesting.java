package code;

import io.appium.java_client.AppiumBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedCondition.*;

@Test
public class ECommerceEndtoEndTesting extends BaseTest{
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
      //  String toastMessage=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        //Assert.assertEquals(toastMessage,"Please enter your name");


        int productCount= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for(int i=0;i<productCount;i++)
        {
            String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if(productName.equalsIgnoreCase("Jordan 6 Rings")){
                driver.findElements(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).get(i).click();

            }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increase timeout to 30 seconds

        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));

        String lastproductpage = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(lastproductpage,"Jordan 6 Rings");
    }
}

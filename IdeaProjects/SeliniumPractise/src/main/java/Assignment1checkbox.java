import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment1checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       // Assert.assertFalse(driver.findElement(By.id("input#checkBoxOption1")).isSelected());
        driver.findElement(By.xpath("//input[@value='option1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
        driver.findElement(By.xpath("//input[@value='option1']")).click();
         Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());

        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));

        int total=checkboxes.size();

        System.out.println("total is "  +   total);
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("sonia");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("2334");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement drop = driver.findElement(By.id("exampleFormControlSelect1"));
        Select a = new Select(drop);
        a.selectByVisibleText("Female");
        driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("2023-12-20");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        // System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
        WebElement text = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        String actualText = text.getText().replace("\n", ""); // Remove newline characters
        String expectedText = "×Success! The Form has been submitted successfully!.";

        Assert.assertEquals(actualText.trim(), expectedText.trim());


    }
}

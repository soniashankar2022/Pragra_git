import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Lesson5Locators {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("sonia");
        driver.findElement(By.name("inputPassword")).sendKeys("Zomato@247");
        driver.findElement(By.className("submit")).click();
       // Thread.sleep(1000);
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Sonia");
    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sonia@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Soniasonia@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Sonia");
        driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();


    }



}
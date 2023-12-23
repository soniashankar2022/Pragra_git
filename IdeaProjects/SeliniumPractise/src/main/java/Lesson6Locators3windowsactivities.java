import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson6Locators3windowsactivities {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //another way to navigate to the website through current browser.
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().back();
        driver.navigate().forward();

    }


}
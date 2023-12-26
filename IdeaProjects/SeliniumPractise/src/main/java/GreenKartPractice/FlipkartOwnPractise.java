package GreenKartPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FlipkartOwnPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        Thread.sleep(9000);
        searchBox.sendKeys("sarees");
        searchBox.sendKeys(Keys.ENTER);

        // Wait for some time to let the results load
        Thread.sleep(5000);

        // Updated selector to be more specific
        List<WebElement> sarees = driver.findElements(By.xpath("//div[@class='_1AtVbE']/a[@title='Embellished Bollywood Georgette Saree']"));

        if (!sarees.isEmpty()) {
            // Click on the first matching saree to view the product page
            sarees.get(0).click();

            // Wait for the product page to load
            Thread.sleep(5000);

            // Locate the "Add to Cart" button and click it
            WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]"));
            addToCartButton.click();

            System.out.println("Saree added to cart!");
        } else {
            System.out.println("Desired saree not found!");
        }

        // Close the browser
        driver.quit();
    }
}

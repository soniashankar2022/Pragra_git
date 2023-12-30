package GreenKartPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment3ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        String[] mobiles = {"iPhone", "Samsung", "Blackberry"};
        WebElement credentialsElement = driver.findElement(By.xpath("//p[@class='text-center text-white']"));
        String credentialsText = credentialsElement.getText().trim();
        String[] keyValuePairs = credentialsText.split(" ");
        String username = keyValuePairs[2];
        String password = keyValuePairs[6].replace(")", "");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(6));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("Consultant");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer .btn-info")));
        List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for (WebElement product : products) {
            String productName = product. findElement(By.xpath("parent::div/preceding-sibling::h4/a")).getText().trim();
            List<String> itemsRequired = Arrays.asList(mobiles);
            if (itemsRequired.contains(productName)) {
                product.click();
                break;
            }
        }
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
    }
}

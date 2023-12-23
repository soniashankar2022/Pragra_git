import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutusuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("so");
        Thread.sleep(3000);
        List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
        for(WebElement option:options){
            if(option.getText().equalsIgnoreCase("South Africa")){
                option.click();
                break;
            }
        }
    }
}